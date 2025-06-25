package com;

import java.util.ArrayList;
import java.util.List;

import com.model.Driver;
import com.service.Travel;

public class Test {
	public static void main(String[] args) {
		ArrayList<Driver> drivers = new ArrayList<>();

		Driver driver = new Driver(10, "Default", "Car", 123.45); // Fix: create this variable
		drivers.add(driver);

		drivers.add(new Driver(1, "Balaji", "Lorry", 3000.9));
		drivers.add(new Driver(2, "Raj", "Car", 365.0));
		drivers.add(new Driver(3, "Hari", "Bus", 879.90));
		drivers.add(new Driver(4, "Prudhvi", "Car", 206.78));
		drivers.add(new Driver(5, "Balram", "Auto", 789.09));
		drivers.add(new Driver(6, "Krishna", "Scooty", 897.10));
		drivers.add(new Driver(7, "Junoon", "Car", 345.90));

		Travel travel = new Travel();

		boolean isCarDriver = travel.isCarDriver(driver);
		System.out.println(isCarDriver);

		String retriveByDriverId = travel.retriveByDriverId(drivers, 5);
		System.out.println(retriveByDriverId);

		long retriveCountOfDriver = travel.retriveCountOfDriver(drivers, "Scooty");
		System.out.println(retriveCountOfDriver);

		long retriveCountOfDriver2 = travel.retriveCountOfDriver(drivers, "Bike");
		System.out.println(retriveCountOfDriver2);

		List<Driver> retriveDriver = travel.retriveDriver(drivers, "Scooty");
		System.out.println(retriveDriver);

		List<Driver> retriveDriver2 = travel.retriveDriver(drivers, "car");
		System.out.println(retriveDriver2);

		Driver driver3 = travel.retriveMaximumDistanceTravelledDriver(drivers);
		System.out.println(driver3);
	}
}
