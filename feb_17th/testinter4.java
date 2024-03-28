package feb_17th;

/*  INTERFACE TYPE 4*/

/* INTERFACE INHERITANCE*/
/*	This is multilevel INHERITANCE*/

interface Printable2 {
	void print();
}

interface Showable2 extends Printable2 {
	void show();

}

class Testinterface2 implements Showable2 {

	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
		
	}

}
public class testinter4 {

	public static void main(String[] args) {
		Testinterface2 obj = new Testinterface2();
		obj.print();
		obj.show();
	}

}
