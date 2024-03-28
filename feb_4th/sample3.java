package feb_4th;

import feb_3rd.Sample_Parameter_code;

//* Parmeterized constructor *//

public class sample3 {

	int a, b, e, d; // class/ instance variable
	int result;

	public sample3(int a, int b, int d, int e) // Parameterized constructor //
												// local level parameterized
												// variable
	//public sample3(int x, int y, int z, int w)
	
	{
		this.a = a;
		this.b = b;
		this.e = e;
		this.d = d;
		
		//a=x; b =y; e =z; d=w;
	}
	public void sum() {

		result = a + b + e + d;
		System.out.println("addition" + result);
	}

	public void mul() {

		result = a * b * e * d;
		System.out.println((result));
	}

	public static void main(String[] args) {
		
		sample3 obj = new sample3(1, 2, 3, 4);
		obj.sum();

		sample3 obj1 = new sample3(20, 2, 30, 40);
		obj1.mul();

		Sample_Parameter_code obj3 = new Sample_Parameter_code();
		obj3.sum(10, 20);

		sample4 obj2 = new sample4(10, 20, 30, "Raj");
		//obj2.addition();
	}

}
