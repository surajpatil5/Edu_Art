package feb_17th;

/* INTERFACE TYPE 1*/
/* INTERFACE USING ONE METHOD */

 interface google {

	public void print();   // abstract method only
	
}
class flipkart implements google {
	
	//interface method implemented
	public void print()   //concrete method
	{
		System.out.println("Welcome Interface method");
	}
}

public class testinter1 extends flipkart {
	public void print1() {
		System.out.println("hello new");
	}
	public static void main(String[] args) {

		testinter1 obj1 = new testinter1();
		obj1.print();
		obj1.print1();
	}

}
