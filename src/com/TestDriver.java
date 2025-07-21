package com;

import java.util.Scanner;

public class TestDriver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1.Create driver array
        Driver[] drivers = new Driver[5];
        drivers[0] = new Driver(1, "Balaji", "Auto", 1000);
        drivers[1] = new Driver(2, "Bharath", "Car", 2000);
        drivers[2] = new Driver(3, "Prudhvi", "Car", 3500);
        drivers[3] = new Driver(4, "Vinodh",  "Bus", 1500);
        drivers[4] = new Driver(5, "Hemanth", "Bus", 2500);

        // 2.Create Travel object
        Travel travel = new Travel();
        // 3.Test: Check if driver is Car driver
        System.out.println("Checking if driver is a car driver:");
        System.out.println("Enter driver index (0-4): ");
        int index = sc.nextInt();
        if(index >0 && index<drivers.length) {
        	System.out.println("Is "+drivers[index].getDriverName()+
        			" a car driver? "+travel.isCarDriver(drivers[index]));
        }
        // 3.Test: Retrieve by driver ID
        System.out.println("\nEnter driver ID to retrieve details: ");
        int inputId = sc.nextInt();
        String driverDetails = travel.retrivebyDriverId(drivers, inputId);
        System.out.println(driverDetails);

        // 3.Test: Retrieve count by category
        System.out.println("\nEnter category to count drivers: ");
        sc.nextLine();  // Consume newline
        String category = sc.nextLine();
        int count = travel.retriveCountOfDriver(drivers, category);
        System.out.println("Number of drivers in category '" + category + "': " + count);

        // 4.Test: Retrieve driver names by category
        System.out.println("\nEnter category to get driver names: ");
        String getcategory = sc.nextLine();
        String names = travel.retriveDriver(drivers, getcategory);
        System.out.println("Drivers in category '" + getcategory + "': " + names);

     // 5.Test: Get maximum distance traveled in a category
        System.out.println("\nEnter category to find max distance: ");
        String getcategoryMaxDistance = sc.nextLine();
        double maxDist = travel.retriveMaximumDistanceTravelledDriver(drivers, getcategoryMaxDistance);
        System.out.println("Maximum distance in category '" +getcategoryMaxDistance + "' is: " + maxDist + " KM");

        sc.close();
    }
}
