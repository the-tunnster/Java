package InheritanceWork;

public class First{

	private int trait1;
	private int trait2;
	private int trait3;
	
	public First(){
		this.trait1 = -1;
		this.trait2 = -2;
		this.trait3 = -3;
	}

	public First(int t1, int t2, int t3){
		this.trait1 = t1;
		this.trait2 = t2;
		this.trait3 = t3;
	}

	public void Display(){
		System.out.println(this.trait1 + " " + this.trait2 + " " + this.trait3);
	}

	public void Adder(){
		System.out.println(this.trait1 + this.trait2 + this.trait3);
	}
	
}
