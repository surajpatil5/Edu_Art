//* program Using object in class *//
package feb_3rd;

public class sample {

	int a = 50, b = 60, e; // instance  or class level variable

	public void sum() { // user defined method
		int a = 20, b = 20, e; // local variable

		e = a + b;
		
		System.out.println("Result of a & b is" + e);
	}

	public void mul() { // user defined method

		int a = 10, b = 5, e; // local variable

		e = a * b;

		System.out.println("value of c" + e);
	}

	public static void main(String[] args) { //system defined method
		
		//syntax  class name obj name = new class name();
		
		sample obj = new sample();
		obj.sum();
		obj.mul();
		
		Sample_Parameter_code obj1 = new Sample_Parameter_code();
		obj1.sum(10, 20);
		
		
	}

}