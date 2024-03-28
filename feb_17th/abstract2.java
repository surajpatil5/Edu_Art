package feb_17th;

// abstract class using constructor & concrete method & abstract method//

abstract class alfa {
	public alfa() // constructor//
	{
		System.out.println("bike is created");
	}

	abstract void run(); // abstract method//

	public void changegear() // concrete method//
	{
		System.out.println("gear changed");
	}
}

 class beta extends alfa {
	void run() {
		System.out.println("running safely..");
	}
}

public class abstract2 {
	public static void main(String args[]) {
		beta obj = new beta();
		obj.run();
		obj.changegear();
		
	}
}