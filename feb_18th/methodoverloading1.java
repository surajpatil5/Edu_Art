package feb_18th;

class v {
	int a, b;

	public void calc(int x) {
		
		a = x;
		System.out.println("value" + a);
		System.out.println("square of a is" + (a * a));
	}
	public void calc(int x, int y) {
		a = x;
		b = y;
		System.out.println("value" + a);
		System.out.println("value" + b);
		System.out.println("addition of a & b is" + (a + b));
	}
}
public class methodoverloading1 {

	public static void main(String args[]) {
		v obj = new v();
		
		obj.calc(5);
		obj.calc(6, 7);

	}

}
