package com;

import java.util.ArrayList;
import java.util.Scanner;

public class TestDriver1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Create driver array
        Driver[] drivers = new Driver[5];
        drivers[0] = new Driver(1, "Balaji", "Auto", 1000);
        drivers[1] = new Driver(2, "Bharath", "Car", 2000);
        drivers[2] = new Driver(3, "Prudhvi", "Car", 3500);
        drivers[3] = new Driver(4, "Vinodh", "Bus", 1500);
        drivers[4] = new Driver(5, "Hemanth", "Bus", 2500);

        // 2. Add Driver[] array to ArrayList<Driver[]>
        ArrayList<Driver[]> driverList = new ArrayList<>();
        driverList.add(drivers); // Add the full array as a single element

        // 3. Create Travel1 object
        Travel1 travel = new Travel1();

        // 4. Test: Check if driver is Car driver
        System.out.println("Checking if driver is a car driver:");
        System.out.println("Enter driver index (0-4): ");
        int index = sc.nextInt();
        if (index >= 0 && index < drivers.length) {
            System.out.println("Is " + drivers[index].getDriverName() +
                    " a car driver? " + travel.isCarDriver(drivers[index]));
        } else {
            System.out.println("Invalid Index.");
        }

        // 5. Test: Retrieve by driver ID
        System.out.println("\nEnter driver ID to retrieve details: ");
        int inputId = sc.nextInt();
        String driverDetails = travel.retriveByDriverId(driverList, inputId);
        System.out.println(driverDetails);

        // 6. Test: Retrieve count by category
        System.out.println("\nEnter category to count drivers: ");
        sc.nextLine();  // Consume newline
        String category = sc.nextLine();
        int count = travel.retriveCountOfDriver(driverList, category);
        System.out.println("Number of drivers in category '" + category + "': " + count);

        // 7. Test: Retrieve driver names by category with input validation loop
        String getcategory;
        String names;
        do {
            System.out.println("\nEnter category to get driver names: ");
            getcategory = sc.nextLine();
            names = travel.retriveDriver(driverList, getcategory);

            if (names.startsWith("No drivers found")) {
                System.out.println(names);
                System.out.println("Please enter a valid category like Car, Bus, Auto.");
            } else {
                break; // valid input, exit loop
            }
        } while (true);

        System.out.println("Drivers in category '" + getcategory + "': " + names);

        // 8. Test: Get maximum distance traveled in a category
        System.out.println("\nEnter category to find max distance: ");
        String getcategoryMaxDistance = sc.nextLine();
        double maxDist = travel.retriveMaximumDistanceTravelledDriver(driverList, getcategoryMaxDistance);
        System.out.println("Maximum distance in category '" + getcategoryMaxDistance + "' is: " + maxDist + " KM");

        sc.close();
    }
}
