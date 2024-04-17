
package com.demo;

public class CityListPrinter {
    public static void main(String[] args) {
        // Check if there are command line arguments
        if (args.length == 0) {
            System.out.println("No cities provided. Please provide a list of cities as command line arguments.");
        } else {
            System.out.println("List of Cities:");

            // Iterate through the command line arguments using a regular for loop
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        }
    }
}
