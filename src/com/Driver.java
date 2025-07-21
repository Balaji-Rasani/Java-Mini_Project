package com;

public class Driver {//Create a blue print
	
	//POJO Class-->Plain old Java Object-->
	
	//Driver Details
	
	//1.Variables-Privete
	
	private String category;

	private int driverId;
	
	private String driverName;
	
	private double totalDistance;
	
	//2.Default-Constructor
	public Driver() {
		
	}
	
	//3.Parameterized-Constructors -->must be declared default constructor manually

	public Driver(int driverId, String driverName, String category, double totalDistance) {
		super();
		this.driverId = driverId;
		this.driverName = driverName;
		this.category = category;
		this.totalDistance = totalDistance;
	}
	
	//4.Getters & Setters -->For Encapsulation(Private+Public)
	
	public String getCategory() {
		return category;
	}

	public int getDriverId() {
		return driverId;
	}

	public String getDriverName() {
		return driverName;
	}

	public double getTotalDistance() {
		return totalDistance;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public void setTotalDistance(double totalDistance) {
		this.totalDistance = totalDistance;
	}

	//5.ToString-->To print the Output
	
	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", driverName=" + driverName + ", category=" + category
				+ ", totalDistance=" + totalDistance + "]";
	}
}
