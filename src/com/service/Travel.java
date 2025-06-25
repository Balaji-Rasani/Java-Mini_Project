package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Driver;

public class Travel {

	public boolean isCarDriver(Driver driver) {
		return driver.getCategory().equalsIgnoreCase("CAR");
	}

	public String retriveByDriverId(ArrayList<Driver> drivers, int driverId) {
		return drivers.stream().filter(d -> d.getDriverId() == driverId).findFirst()
				.map(d -> String.format("Driver name is %s belonging to category %s traveled %.2f KM so far",
						d.getDriverName(), d.getCategory(), d.getTotalDistance())) // ✅ Not getTotalDisatnce()
				.orElse("No driver matched");
	}

	public long retriveCountOfDriver(ArrayList<Driver> drivers, String category) {
		return drivers.stream().filter(d -> d.getCategory().equalsIgnoreCase(category)).count();
	}

	public List<Driver> retriveDriver(ArrayList<Driver> drivers, String category) {
		return drivers.stream().filter(d -> d.getCategory().equalsIgnoreCase(category)).toList();
	}

	public Driver retriveMaximumDistanceTravelledDriver(ArrayList<Driver> drivers) {
		return drivers.stream().max((d1, d2) -> Double.compare(d1.getTotalDistance(), d2.getTotalDistance()))
				.orElse(null);
	}
}
