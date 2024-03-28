package feb_25th;

public class Static_Example {
	
	public static void sum()
	{
		int a =10, b =20, c;
		c= a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		 Static_Example obj = new Static_Example();
		 obj.sum();
		 
		/*
		 * static method it can be accessable in same class directly or 
		 * by class name
		 */
		
		sum();
		Static_Example.sum();
		
	}

}
