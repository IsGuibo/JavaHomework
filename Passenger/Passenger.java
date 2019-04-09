package com.example.lib.JavaHomework.Passenger;

public class Passenger implements PassengerInterface {
	private String names;
	private int bookingNumber;
	private int rows; 							
	private int seatPosition;
	public Passenger(String names, int bookingNumber, int rows, int seatPosition) {
		this.names = names;
		this.bookingNumber = bookingNumber;
		this.rows = rows;
		this.seatPosition = seatPosition;
	}
	public String getName() {
		return names;
	}
	public int getBookingNumber() {
		return bookingNumber;
	}
	public int getRow() {
		return rows;
	}
	public int getSeatPosition() {
		return seatPosition;
	}
}
