package com.example.lib.Passenger;

public class Flight implements FlightInterface {
	private String flightName;
	private int row;
	private int rowLength;
	private int[] fail = { -1 };
	private Passenger[] passengerList;
	/**
	 * 航班类的构造方法
	 */
	public Flight(String FlightName, int rows, int rowLength)
			throws Exception {
		if (FlightName == null || FlightName.trim().length() == 0 || rows <= 0
				|| rowLength <= 0)
			throw new Exception("Error");
		else {
			this.flightName = FlightName;
			this.row = rows;
			this.rowLength = rowLength;
			this.passengerList = new Passenger[row * rowLength];
			for (int i = 0; i < row * rowLength; i++)
				passengerList[i] = null;
		}
	}

	@Override
	public int[] reserve(String[] names) {
		return new int[0];
	}

	@Override
	public boolean cancel(int bookingNumber) {
		return false;
	}

	@Override
	public Passenger[] getPassengerList() {
		return new Passenger[0];
	}
}
