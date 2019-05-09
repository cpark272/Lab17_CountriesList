package co.grandcircus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class CountriesTextFile {
	
	// This method will extract text from a .txt file
	public static void readFromFile() {
		String file = "countries.txt";
		Path filePath = Paths.get(file);
		
		File f = filePath.toFile();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(f));
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("The file was not found.");
			
		} catch (IOException e) {
			System.out.println("Something crazy happened, please contact IT for additional support.");
		}
		
	}
	
	// Overloaded method to write an entire list to the file
	public static void writeToFile(ArrayList<Country> countries) {
		String fileName = "countries.txt";
		Path path = Paths.get(fileName);
		
		File file = path.toFile();
		PrintWriter output = null;
		
		try {
			output = new PrintWriter(new FileOutputStream(file, false));
			
			for (Country c : countries) {
				output.println(c);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Something strange happned, please contact It for additional support.");
			
		} finally {
			output.close();
			
		}
		
	}
	
	// Method to write a single object to the file
	public static void writeToFile(String countryName, int countryPop) {
		String fileName = "countries.txt";
		Path path = Paths.get(fileName);
		
		File file = path.toFile();
		PrintWriter output = null;
		
		try {
			output = new PrintWriter(new FileOutputStream(file, false));
			//output.println()
			
		} catch (FileNotFoundException e) {
			System.out.println("Something is not working properly, please contact IT.");
		} finally {
			output.close();
			
		}
		
	}
	
	// Method to create a countries.txt file if one doesn't exist
	public static void createOurFile(String fileName) {
		Path path = Paths.get(fileName);
		
		if (Files.notExists(path)) {
			try {
				Files.createFile(path);
				System.out.println("The file was created successfully!");
				
			} catch (IOException e) {
				System.out.println("Soemthing went wrong, please contact IT.");
			}
			
		} else {
			System.out.println("The file already exists");
		}
		
	}

}
