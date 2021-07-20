package CSVReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class userMain{

	static ArrayList <User> UserRecords = new ArrayList<>();
	static String filePath = "/home/the_tunnster/Workspaces/Java Workspace/CSVReader/users.csv";
	
	public static void main(String []args){
		
		Scanner sc = fileOpener();

		if(sc == null){
			System.exit(0);
		}

		while(sc.hasNextLine()){

			String []temp = sc.nextLine().split(",");
			if(temp[0].equals("first_name")){
				continue;
			}

			User u = userRecordReader(temp);
			
			UserRecords.add(u);

		}

		userRecordDisplayer();

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
	
	public static User userRecordReader(String []temp){

		String fN = temp[0];
		String lN = temp[1];
		String eID = temp[2];
		String pN = temp[3];
		String c = temp[4];

		User u = new User(fN, lN, eID, pN, c);

		return u;

	}

	public static void userRecordDisplayer(){
		for( User f : UserRecords){
			f.DisplayInformation();
		}
	}

}
