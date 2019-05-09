package co.grandcircus;

import java.util.ArrayList;
import java.util.Scanner;

public class CountriesApp {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		CountriesTextFile cList = new CountriesTextFile();
		
		// Initialize variables
		int userProgram = 0;

		// Title of program
		System.out.println("Welcome to the Countries Maintenance Application!");
		
		
		// While loop to keep running program until user press 3 to exit the program
		while (userProgram != 3) {

			System.out.println("1 - See the list of countries");
			System.out.println("2 - Add a country");
			System.out.println("3 - Exit");

			// Prompts user to choose a menu option
			userProgram = Validator.getInt(scan, "\nEnter menu number: ", 1, 3);
			
			// List of countries in the countries.txt file
			ArrayList<Country> countryList = new ArrayList<>();
			
			// 1 - Reads and prints out a list of the countries and their population data from the countries.txt
			if (userProgram == 1) {
				for(Country c: countryList) {
					System.out.println(c);
				}
			
			// 2 - Adds a country into the countries.txt
			} else if (userProgram == 2) {
				CountriesTextFile.writeToFile(countryList);
			} else {
				
			}
			
		}
	
	}

}
