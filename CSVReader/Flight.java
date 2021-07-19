package CSVReader;

public class Flight {

	private int flightNumber;
	private String fromCity;
	private String toCity;
	private int numberOfStops;
	private String []stops;
	private int time;
	private int price;

	public Flight(){
		this.flightNumber = -1;
		this.fromCity = "null";
		this.toCity = "null";
		this.numberOfStops = -1;
		this.stops = null;
		this.time = -1;
		this.price = -1;
	}

	public Flight(int fN, String fC, String tC, int nOs, String []s, int t, int p){
		this.flightNumber = fN;
		this.fromCity = fC;
		this.toCity = tC;
		this.numberOfStops = nOs;
		this.stops = s;
		this.time = t;
		this.price = p;
	}

	public void DisplayFlightInformation(){
		System.out.print("Flight number : " + this.flightNumber + ", ");
		System.out.print("From city : " + this.fromCity + ", ");
		System.out.print("To city : " + this.toCity + ", ");
		System.out.print("Number of stops : " + this.numberOfStops + ", ");

		System.out.print("Stops : ");
		if(this.numberOfStops==0){
			System.out.print(this.stops + ", ");
		}else{
			
			for(int i = 0; i< numberOfStops; i++){
				System.out.print(stops[i] + ", ");
			}
		}
		
		System.out.print("Time : " + this.time + ", ");
		System.out.println("Price : " + this.price + ".");
	}
	
}
