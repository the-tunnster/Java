package CSVReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class CSVMain{

	static ArrayList <CSVRecord> FlightRecords = new ArrayList<>();
	static ArrayList <CSVRecord> UserRecords = new ArrayList<>();

	static String flightPath = "/home/the_tunnster/Workspaces/Java Workspace/CSVReader/flights.csv";
	static String userPath = "/home/the_tunnster/Workspaces/Java Workspace/CSVReader/users.csv";

	public static void main(String []args){

		Scanner scFlights = fileOpener(flightPath);
		Scanner scUser = fileOpener(userPath);

		if(scFlights == null || scUser == null){
			System.exit(0);
		}

		flightRecordReader(scFlights);
		userRecordReader(scUser);

		for(CSVRecord r : FlightRecords){
			r.DisplayInformation();
		}

		for(CSVRecord r : UserRecords){
			r.DisplayInformation();
		}


	}

	public static Scanner fileOpener(String filePath){

		Scanner sc = new Scanner(System.in);
		boolean initialised = false;

		try{
			File input = new File(filePath);
			sc = new Scanner(input);
			initialised = true;
		}catch(Exception e){
			System.out.println("Error opening the file");
		}

		if(initialised==false){
			System.out.println("Initialisation of scanner failed.");
			sc = null;
		}
		return sc;
		
	}
	
	public static void flightRecordReader(Scanner scFlights){

		while(scFlights.hasNextLine()){

			String []temp = scFlights.nextLine().split(",");

			if(temp[0].equals("Flight-no")){
				continue;
			}

			int fN = Integer.parseInt(temp[0]);
			String fC = temp[1];
			String tC = temp[2];

			int nOs = Integer.parseInt(temp[3]);
			String []stops = (nOs==0?null:temp[4].split(" "));
			
			int t = Integer.parseInt(temp[5]);
			int p = Integer.parseInt(temp[6]);

			CSVRecord f = new Flight(fN, fC, tC, nOs, stops, t, p);
			FlightRecords.add(f);

	}

}

	public static void userRecordReader(Scanner scUser){

		while(scUser.hasNextLine()){
			String []temp = scUser.nextLine().split(",");

			if(temp[0].equals("first_name")){
				continue;
			}

			String fN = temp[0];
			String lN = temp[1];
			String eID = temp[2];
			String pN = temp[3];
			String c = temp[4];

			CSVRecord u = new User(fN, lN, eID, pN, c);
			UserRecords.add(u);

		}

	}

}
