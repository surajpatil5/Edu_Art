package feb_4th;
//* Using Multiple Constructor *//

//constructor overloading
public class sample4 {

	int a, b, c,d ;
	String name;

	public sample4(int a, int b) {
		
		this.a=a;
		this.b=b;
	}

	public sample4(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public sample4(int x, int w, int z, String name2) {
		a = x;
		b = w;
		name=name2;
	}
	
	public sample4(int x, int y, int z) {
		a = x;
		b = y;
	}

	public void addition() {
		//c = a + b + c + d;
		System.out.println( a + b + c + d);
	}
	
	public void print() {
		System.out.println(name);
	}

	public static void main(String[] args) {
		
		/*sample4 obj = new sample4(1, 2);
		obj.addition();*/
		
		sample4 obj1 = new sample4(1, 2, 3, 5);
		obj1.addition();
		obj1.name="Maharaj";
		System.out.println(obj1.name);
		
	}
}
