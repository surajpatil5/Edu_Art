package feb_18th;

class Vehicle {

	public void run() {
		System.out.println("Vehicle is running safely");
	}

	public void Walk() {
		System.out.println("walking");
	}
}

public class methodoverride1 extends Vehicle {
	// it will override run method of main class over vehicle class
	public void run() {
		System.out.println("Bike is running safely");
	}

	public void sum() {
		System.out.println("addition method");
	}

	public static void main(String args[]) {
		
		  methodoverride1 obj = new methodoverride1();
		  obj.run();
		  obj.sum();
		  obj.Walk();
		  

	}
}