package feb_4th;
//* simple constructor* or User defined constructor //

public class sample2 {

	// deifining & declaring variable
	public int a, b, c;

	public sample2() // constructor name sample 2
	{
		// intializing variable
		a = 10;
		b = 20;
	}

	public void sum() {
		// int a = 10, b = 20, c;
		c = a + b;
		System.out.println("Addition is " + c);
	}

	public static void main(String[] args) {

		sample2 obj = new sample2();
		obj.sum();

		
		sample3 obj1 = new sample3(0,0,0,0);
		obj1.sum();
		 

	}

}
