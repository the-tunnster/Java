package CSVReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class flightMain {

	static ArrayList <Flight> FlightRecords = new ArrayList<>();
	static String filePath = "/home/the_tunnster/Workspaces/Java Workspace/CSVReader/flights.csv";

	public static void main(String []args){
		
		Scanner sc = fileOpener();

		if(sc == null){
			System.exit(0);
		}

		while(sc.hasNextLine()){

			String []temp = sc.nextLine().split(",");
			if(temp[0].equals("Flight-no")){
				continue;
			}

			Flight f = flightRecordReader(temp);
			
			FlightRecords.add(f);

		}

		flightRecordDisplayer();

		sc.close();

	}

	public static Scanner fileOpener(){

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
	
	public static Flight flightRecordReader(String []temp){

		int fN = Integer.parseInt(temp[0]);
		String fC = temp[1];
		String tC = temp[2];

		int nOs = Integer.parseInt(temp[3]);
		String []stops = (nOs==0?null:temp[4].split(" "));
		
		int t = Integer.parseInt(temp[5]);
		int p = Integer.parseInt(temp[6]);

		Flight f = new Flight(fN, fC, tC, nOs, stops, t, p);

		return f;

	}

	public static void flightRecordDisplayer(){
		for( Flight f : FlightRecords){
			f.DisplayFlightInformation();
		}
	}
}
