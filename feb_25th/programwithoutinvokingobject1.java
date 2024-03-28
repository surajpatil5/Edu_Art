package feb_25th;

// program without invoking object with returning value
public class programwithoutinvokingobject1 {
	static int a = 10, b = 20, c = 30;
	static int result;

	public static int multiply() {

		result = a * b * c;

		System.out.println(result);

		return result; // This is last statement of any method
						// You cannot write anything after return statement
	}

	public static String methodname()

	{
		String name = "prafull";
		System.out.println(name);
		return name;
	}

	public static void main(String[] args) {

		//first way
		int x = multiply();

		//second way
		//int x = programwithoutinvokingobject1.multiply(); // calling without //
															// we are catching
															// o/p of multiply
															// method into x
															// variable
		System.out.println(x);

		
		int d = 50;

		int Z = x * d;
		System.out.println(Z);

		String newname = programwithoutinvokingobject1.methodname();

		System.out.println(newname);

	}
}
