package feb_3rd;

//parameterized user defined methods

public class Sample_Parameter_code {

	public void sum(int a, int b) { // user defined method
		int c;

		c = a + b;

		System.out.println(c);
	}

	public void mul(int a, int b) { // user defined method
		int c;

		c = a * b;

		System.out.println("value of c" + c);
	}

	public static void main(String[] args) {

		Sample_Parameter_code obj = new Sample_Parameter_code();
		obj.sum(50, 60);
		obj.sum(1, 2);
		obj.mul(1, 2);

		sample obj1 = new sample();
		obj1.sum();
		obj1.mul();

	}

}
