package com;

public class Travel {//(Optional)
	//Create Methods
	
	//all are instance methods -->need object
	
	//1st method-->Checks if the given driver is a Car driver
	public boolean isCarDriver(Driver driver) {
		if(driver == null || driver.getCategory() == null)
			return false;
		return driver.getCategory().equalsIgnoreCase("Car");
	}
	
	//2nd method-->Retrieves driver details by driver ID
	public String retrivebyDriverId(Driver[] drivers, int driverId) {
		for(Driver driver: drivers) {
			if(driver.getDriverId() == driverId) {
				return "Driver name is "+driver.getDriverName()+
						", belonging to the category "+driver.getCategory()+
						", travelled "+driver.getTotalDistance()+" KM so far.";
			}
		}
		
		return "Driver with ID "+driverId+" not found!!!";
	}
	
	//3rd method-->Counts how many drivers belong to a given category
	public int retriveCountOfDriver(Driver[] drivers,String category ) {
		int count=0;
		for(Driver driver:drivers) {
		if(driver.getCategory().equalsIgnoreCase(category)) {
			count++;
		}
		}
		
		return count;
	}
	
	//4th method-->Retrieves all driver names for a given category
	public String retriveDriver(Driver[] drivers,String category) {
		String result ="";
		for(Driver driver: drivers) {
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
		return result;
	}
	
	//5th method-->Finds the maximum distance traveled among all drivers
	public double retriveMaximumDistanceTravelledDriver(Driver[] drivers, String category) {
		if(drivers == null || category == null) return 0;
		
		double maxDistance = 0;
		boolean found = false;
		
		for(Driver driver : drivers) {
			if(driver.getCategory().equalsIgnoreCase(category)) {
				if(!found || driver.getTotalDistance()>maxDistance)
				maxDistance = driver.getTotalDistance();
				found=true;
			}
		}
		 
		return found? maxDistance:0;
	}
	
}
