package InheritanceWork;

public class Main{

	public static void main(String []args){

		First f = new First(1, 2, 3);
		Second s = new Second(1, 2, 3, 4, 5, 6);
		Third t = new Third(1, 2, 3, 7, 8, 9);

		f.Display();
		s.Display();
		t.Display();

		f.Adder();
		s.Adder();
		t.Adder();
		

	}
	
}
