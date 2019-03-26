package com.example.lib.Passenger;
import java.util.*;
import java.io.*;

public class Client {
	private String flightName = null;
	private int row = 0;
	private int rowLength = 0;
	private Flight flight = null;
	private String cmdString = null;
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		new Client().commandShell();
	}
	private void commandShell() {
		System.out.println("\n\n================================");
		System.out.println(" Command Shell V2.01 ");
		System.out.println(" type 'exit' command to exit.");
		while (true) {
			readCommand();
			processCommand();
		}
	}


	private void readCommand() {

		if (flightName == null) {
			System.out.println("*********************************************");
			System.out.println("Please Create The Flight Data First!");
			System.out
					.println("Use command: create  flight_name  rows  rowLenght <CR>");
			System.out
					.println("*********************************************\n\n\n");
		}
		System.out.print("\nCOMMAND>");
		try {
			cmdString = br.readLine().trim();
		} catch (IOException e) {
			System.out.println(" command error!  ");
			cmdString = null;
		}
	}


	private void processCommand() {

		String[] cmds;
		String cmd;
		if (cmdString != null) {
			cmds = command(cmdString);
			if (cmds != null){
				cmd = cmds[0].toLowerCase();
				if (cmd.equals("create")) {
					if (flightName == null)
						createCommand(cmds);
					else {
						System.out.println("Create Error:can't handle more flights!");
					}
				} else if (cmd.equals("reserve")) {
					if (flightName != null)
						reserveCommand(cmds);
				} else if (cmd.equals("cancel")) {
					if (flightName != null)
						cancelCommand(cmds);
				} else if (cmd.equals("list")) {
					if (flightName != null)
						listCommand(cmds);
				} else if (cmd.equals("exit")) {
					System.out.println("Thanks. See you later!");
					System.exit(0);
				} else {
					System.out.println(" Bad command ! ");
					cmdString = null;
				}
			}
		}
	}


	private String[] command(String cmdStr) {
		int cc = 0;
		String[] cmd;
		StringTokenizer st = new StringTokenizer(cmdStr);
		if ((cc = st.countTokens()) == 0)
			return null;
		cmd = new String[cc];
		for (int i = 0; i < cc; i++)
			cmd[i] = st.nextToken();
		return cmd;
	}

	private int readInt(String valstr) {
		int val = 0;
		try {
			val = Integer.parseInt(valstr);
		} catch (Exception e) {
			val = Integer.MIN_VALUE;
		}
		return val;
	}

	private void createCommand(String[] cmds) {
		if (cmds.length != 4) {
			System.out.println("create command error!");
		}

		else {
			flightName = cmds[1];
			row = readInt(cmds[2]);
			rowLength = readInt(cmds[3]);
			if (row <= 0 || rowLength <= 0) {
				System.out.println("create command parameters error!");
				flightName = null;
				row = 0;
				rowLength = 0;
			} else {
				try {
					flight = new Flight(flightName, row, rowLength);
					System.out.println("create Flight OK!");
				} catch (Exception e) {
					System.out.println(e);
					flight = null;
					flightName = null;
					row = 0;
					rowLength = 0;
				}
			}
		}
	}

	private void reserveCommand(String[] cmds) {
		if (cmds.length <= 1) {
			System.out.println("reserve command error!");
			return;
		}
		String[] names = new String[cmds.length - 1];

		for (int i = 0; i < names.length; i++)
			names[i] = new String(cmds[i + 1]);
		int[] bn = flight.reserve(names);
		if (bn[0] != -1) {
			for (int i = 0; i < bn.length; i++)
				System.out.println(names[i] + "'s Booking Number is:" + bn[i]);
		} else
			System.out.println("No Such Sequential Seats Now!");
	}

	private void cancelCommand(String[] cmds) {
		if (cmds.length != 2) {
			System.out.println("\ncancel command format error!");
			return;
		}
		int bookingNumber = readInt(cmds[1]);
		if (bookingNumber <= 0) {
			System.out.println("\ncancel command parameter error!");
			return;
		}
		boolean state = flight.cancel(bookingNumber);
		if (state)
			System.out.println(" Your seat has been cancelled! ");
		else
			System.out.println("The seat has not been reserved!");
	}

	private void listCommand(String[] cmds) {
		if (cmds.length != 1) {
			System.out.println("\nlist command format error!");
			return;
		}
		Passenger[] passengerlist = flight.getPassengerList();
		int flag = 0;
		System.out.println("Name Booking Number Row Seat Position ");
		System.out.println("---------------------------------------------------------");
		if (passengerlist == null || passengerlist.length <= 0)
			System.out.println("Now no seat is occupied!");
		else {
			flag = 0;
			for (int b = 0; b < passengerlist.length; b++) {
				if (passengerlist[b] != null) {
					flag = 1;
					System.out
							.println(formatStr(passengerlist[b].getName())
									+ formatStr(""
											+ passengerlist[b]
													.getBookingNumber())
									+ formatStr("" + passengerlist[b].getRow())
									+ formatStr(""
											+ passengerlist[b]
													.getSeatPosition()));
				}
			}
			if (flag == 0)
				System.out.println("Now no seat is occupied!");
		}
	}

	private String formatStr(String s) {
		for (int i = 0; i < 16 - s.trim().length(); i++)
			s += ' ';
		return s;
	}
}
