package WordCounter;

import java.util.Scanner;
import java.io.File;
import java.util.HashMap;

class WordCount{

	static String fileLocation = "/home/the_tunnster/Workspaces/Java Workspace/WordCounter/input.txt";
	static HashMap<String, Integer> mapper = new HashMap<>();

	public static void main(String []args)throws Exception{

		Scanner sc = fileOpener();
		sc.useDelimiter(" ");
		 
		while(sc.hasNext()){
			String s = sc.next();
			boolean check = mapChecker(s);
			if(check==true){
				mapUpdate(s);
			}else{
				mapAdd(s);
			}
		}   

		mapPrinter();
		sc.close();
	}



	public static Scanner fileOpener(){

		Scanner sc = new Scanner(System.in);

		try{
			File input = new File(fileLocation);
			sc = new Scanner(input);
		}catch(Exception e){
			System.out.println("Error opening file." + e);
		}

		return sc;

	}

	public static boolean mapChecker(String s){

		boolean result = false;

		if(mapper.containsKey(s)){
			result = true;
		}

		return result;

	}

	public static void mapUpdate(String s){
		Integer count = mapper.get(s);
		count ++;
		mapper.put(s, count);
	}

	public static void mapAdd(String s){
		mapper.put(s, 1);
	}
			
	public static void mapPrinter(){
		System.out.println(mapper);
	}

}




