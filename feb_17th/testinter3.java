package feb_17th;

/*  INTERFACE TYPE 3*/
/* TWO INTERFACE USING SAME NAME METHOD*/

interface Printable1 {
	 void print();
}

interface Showable1 {
	void print();
}

class TestTnterface1 implements Printable1, Showable1 {
	public void print() {
		
		System.out.println("hello");
	}

	public void print(int a,int b) {
		
		System.out.println("Hello duplicate");
		
		int c;
		c = a+b;
		System.out.println(c);
	}
}
public class testinter3 {

	public static void main(String[] args) {
		TestTnterface1 obj = new TestTnterface1();
		obj.print();
		obj.print(2, 3);
	}

}
