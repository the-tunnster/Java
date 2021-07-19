package InheritanceWork;

public class Third extends First{

	private int trait1;
	private int trait2;
	private int trait3;
	private int trait7;
	private int trait8;
	private int trait9;

	public Third(){
		super();
		this.trait7 = -7;
		this.trait8 = -8;
		this.trait9 = -9;
	}

	public Third(int t1, int t2, int t3, int t7, int t8, int t9){
		super(t1, t2, t3);
		this.trait7 = t7;
		this.trait8 = t8;
		this.trait9 = t9;
	}

	public void Display(){
		super.Display();
		System.out.println(this.trait7 + " " + this.trait8 + " " + this.trait9);
	}
	
}
