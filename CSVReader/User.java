package CSVReader;

public class User extends CSVRecord{
	
	private String firstName;
	private String lastName;
	private String emailID;
	private String phoneNumber;
	private String city;

	private int numberOfFields = 5;

	public User(){
		super();
		this.firstName = "Default";
		this.lastName = "Default";
		this.emailID = "default@email.com";
		this.phoneNumber = "0000000000";
		this.city = "Default";
	}

	public User(String fN, String lN, String eID, String pN, String c){
		super(5);
		this.firstName = fN;
		this.lastName = lN;
		this.emailID = eID;
		this.phoneNumber = pN;
		this.city = c;
	}

	public void DisplayInformation(){
		System.out.print("First name : " + this.firstName+ ", ");
		System.out.print("Last name : " + this.lastName + ", ");
		System.out.print("Email ID : " + this.emailID + ", ");
		System.out.print("Phone number : " + this.phoneNumber + ", ");
		System.out.println("City : " + this.city + ".");

	}
	
}
