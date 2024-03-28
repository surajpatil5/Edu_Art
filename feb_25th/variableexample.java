package feb_25th;

public class variableexample {
	int a = 10; // non static /instance variable // we can declared it in class but outside of any method or block

	static int b = 20; // class level or static variable

	public static void salary(){
		
	//public void salary() {
		
		//static int e =20; // static variable can be declare at a class level & cannot be declare at local level
		
		int c = 30; // local variable
		System.out.println(c);
		//System.out.println(a); // we can not access instance/non static variable into static method 
	
		// non static method
		System.out.println(b); // we can access static variable in non static
								// method
		
		  for (int i = 0; i <= 5; i++) 
		  { 
			  System.out.println(i);
		  }
	}	

	public static void main(String[] args) {

		//static int e =20; // it will show an error bcoz static or class  variable declared only in class

		//System.out.println(c); //it will show an error bcoz c is local variable we can not access it outside of the method

		//System.out.println(a); // it will show error bcoz a is instance variable we cannot access in static method

		System.out.println(b); // b is a static variable

		int d = 40; // local variable
		System.out.println(d);

		
		/* variableexample obj = new variableexample(); 
		 obj.salary();*/
		 

		// it is accessable because of static method only
		salary(); // It is allowed only if salary method is static

		variableexample.salary(); // this is allowed but use if we want to
									// access in other classes

		for (int i = 0; i <= 5; i++) {
			
			System.out.println(i);
		}
		// System.out.println(i); //it will show error bcoz it is local variable within block
		
		Static_Example.sum();
		
	}

}
