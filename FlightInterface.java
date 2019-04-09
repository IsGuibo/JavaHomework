package com.example.lib.JavaHomework.Passenger;

public interface FlightInterface {

	public int[] reserve(String[] names);

	public boolean cancel(int bookingNumber);

	public Passenger[] getPassengerList();
}
