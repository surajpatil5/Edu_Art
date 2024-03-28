package feb_17th;

 abstract class L {
	public abstract void disp(); // abstract method

	public void display() /// concrete method
	{
		System.out.println("method from x class");
	}
}

abstract class O extends L {
	abstract void ma();

	public void disp1() {
		System.out.println("method display in y class");
	}
}

 class D extends O {

	//abstract void XA();

	void ma() {
		System.out.println("implementation of abstract method");
	}

	public void disp() {
		System.out.println("method display in y class");
	}
}

public class Abstraction1 extends D {
	public void XA() {

	}

	public static void main(String[] args) {
		// L obj1 = new L(); // You can't create object of Abstract class

		Abstraction1 obj = new Abstraction1();

		obj.disp();
		obj.display();
		obj.disp1();
		obj.ma();
	}

}
