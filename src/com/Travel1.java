package com;

import java.util.ArrayList;

public class Travel1 {
	//Create Methods
	
	//all are instance methods -->need object
	//1st method-->Checks if the given driver is a Car driver
	public boolean isCarDriver(Driver driver) {
		if(driver == null || driver.getCategory() == null)
			return false;
		return driver.getCategory().equalsIgnoreCase("Car");
	}
	
	//2nd method-->Retrieves driver details by driver ID
	public String retriveByDriverId(ArrayList<Driver[]>drivers, int driverId) {
		//Driver[]->array of driver objects [driver1],[driver2]
		//drivarArray-> temporary variable holds each individual Driver[]
		//drivers-->actual ArrayList->contains multiple arrays of Driver objects
		for(Driver[] driverArray: drivers) {
			//Driver-is object & driver->Temporary variable
			//driverArray-->current array of drivers
			for(Driver driver: driverArray) {
			if(driver !=null && driver.getDriverId() == driverId) {
				return "Driver name is "+driver.getDriverName()+
						", belonging to the category "+driver.getCategory()+
						", travelled "+driver.getTotalDistance()+" KM so far.";
			}
		}
		}
		
		return "Driver with ID "+driverId+" not found!!!";
	}
	
	//3rd method-->Counts how many drivers belong to a given category
	public int retriveCountOfDriver(ArrayList<Driver[]> drivers,String category ) {
		int count=0;
		//Driver[]->array of driver objects [driver1],[driver2]
		//drivarArray-> temporary variable holds each individual Driver[]
		//drivers-->actual ArrayList->contains multiple arrays of Driver objects
		for(Driver[] driverArray:drivers) {
			//Driver-is object & driver->Temporary variable
			//driverArray-->current array of drivers
			for(Driver driver:driverArray) {
		if(driver.getCategory().equalsIgnoreCase(category)) {
			count++;
		}
		}
		}
		
		return count;
	}
	
	//4th method-->Retrieves all driver names for a given category
	public String retriveDriver(ArrayList<Driver[]> drivers,String category) {
		String result ="";
		//Driver[]->array of driver objects [driver1],[driver2]
		//drivarArray-> temporary variable holds each individual Driver[]
		//drivers-->actual ArrayList->contains multiple arrays of Driver objects
		for(Driver[] driverArray: drivers) {
			//Driver-is object & driver->Temporary variable
			//driverArray-->current array of drivers
			for(Driver driver:driverArray) {
			if(driver.getCategory().equalsIgnoreCase(category)) {
				if(!result.isEmpty()) {//also use .equals("") & isEmpty()for better readability
					result+=", ";//space b/w names
				}
				result+=driver.getDriverName();
			}
		}
		if(result.equals("")) {
			return "No drivers found in category: "+category;
		}
		}
		return result;
	}
	
	//5th method-->Finds the maximum distance traveled among all drivers
	public double retriveMaximumDistanceTravelledDriver(ArrayList<Driver[]> drivers, String category) {
		if(drivers == null || category == null) return 0;
		
		double maxDistance = 0;
		boolean found = false;
			//Driver[]->array of driver objects [driver1],[driver2]
			//drivarArray-> temporary variable holds each individual Driver[]
			//drivers-->actual ArrayList->contains multiple arrays of Driver objects
		for(Driver[] driverArray : drivers) {
			//Driver-is object & driver->Temporary variable
			//driverArray-->current array of drivers
			for(Driver driver: driverArray) {
			if(driver.getCategory().equalsIgnoreCase(category)) {
				if(!found || driver.getTotalDistance()>maxDistance)
				maxDistance = driver.getTotalDistance();
				found=true;
			}
		}
		}
		return found? maxDistance:0;
	}
	
}
