package InheritanceWork;

public class Second extends First{
	
	private int trait1;
	private int trait2;
	private int trait3;
	private int trait4;
	private int trait5;
	private int trait6;

	public Second(){
		super();
		this.trait4 = -4;
		this.trait5 = -5;
		this.trait6 = -6;
	}

	public Second(int t1, int t2, int t3, int t4, int t5, int t6){
		super(t1, t2, t3);
		this.trait4 = t4;
		this.trait5 = t5;
		this.trait6 = t6;
	}

	public void Display(){
		super.Display();
		System.out.println(this.trait4 + " " + this.trait5 + " " + this.trait6);
	}

	
}
