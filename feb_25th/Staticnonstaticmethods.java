package feb_25th;

public class Staticnonstaticmethods {
	
	// static/class level variable
	 static int a=10;
	
	//instance variable // non-static variable
	 int b =20;
	 
	 //Static method
	 public static void abc() 
	 {
		 System.out.println(a);// This is static method it will only access static variable.
		//System.out.println(b); //This is instance or non-static variable , you can not access in static method
		//System.out.println(a+b); // This is static method it will not access instance or non static variable.
		 int c = 30;  //local variable
		 System.out.println("add: "+(a+c));
	 }
	 
	 //non static method
	public void abc2()
	 {
		 System.out.println(a+b);// this is non static method it can access both static & non static variables.
		 //System.out.println(c); // it is a local variable from static method that we cannot access it in another method
		 System.out.println(b);  //instance variable we can call in non static method
		 System.out.println(a);  // static variable we can call in non static method
	 }

	 //Static method
	 public static void abc3()
	 {
		 System.out.println("it is static method");
		 abc(); //static method access only static method
		 Staticnonstaticmethods obj = new Staticnonstaticmethods();
		 obj.abc2();
		 //abc2(); // non-static method can not directly access in static methods
	 }
	 //non static method
	 public void abc4()
	 {
		 System.out.println("it is non static method");
		 abc();  //Non static method can access both static & non static methods
		 abc2();
		 abc3();
	 }
	 
	 
	 //  main method is static method but we can access all static & non static method 
	 // but in main method we can access non static method only by object not directly
	public static void main(String[] args) 
	{
		Staticnonstaticmethods obj1 = new Staticnonstaticmethods();
		obj1.abc2();
		obj1.abc4();
		
		//one way
		abc();
		abc3();
		//second way
		Staticnonstaticmethods.abc();
		Staticnonstaticmethods.abc3();
		
		//salary();
		
		variableexample.salary();
		
		
		
	
	}

}
