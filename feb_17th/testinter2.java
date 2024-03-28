package feb_17th;

/* INTERFACE TYPE 2*/

/* TWO INTERFACE USING TWO METHOD */

/*This is multiple inheritance*/

 interface Print {
	public void print();
}

interface Showable {
	public void show();
}

class A7 implements Print, Showable{

	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

}
public class testinter2 extends A7 {

	public void stackprint() {
		System.out.println("stack");
	}

	public static void main(String[] args) {
		testinter2 obj = new testinter2();
		obj.print();
		obj.show();
		obj.stackprint();
	}

}
