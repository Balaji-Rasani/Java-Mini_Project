package com.model;

public class Driver {

	private int driverId;

	private String driverName;

	private String category;

	private Double totalDistance;

	public Driver() {

	}

	public Driver(int driverId, String driverName, String category, Double totalDisatnce) {
		super();
		this.driverId = driverId;
		this.driverName = driverName;
		this.category = category;
		this.totalDistance = totalDisatnce;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getTotalDistance() {
		return totalDistance;
	}

	public void setTotalDistance(Double totalDisatnce) {
		this.totalDistance = totalDisatnce;
	}

	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", driverName=" + driverName + ", category=" + category
				+ ", totalDisatnce=" + totalDistance + "]";
	}

}
