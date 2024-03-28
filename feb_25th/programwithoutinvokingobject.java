package feb_25th;

// program without creating/invoking object without returning value
public class programwithoutinvokingobject {
	static int a, b, c;
	static int x;

	public static void multiply(int p, int q, int r) {
		
		a=p;
		b=q;
		c=r;
		x = a * b * c;
		System.out.println(x);
	}

	public static void sum() {
		System.out.println("addition methd");
	}

	public static void main(String[] args) {
		

		programwithoutinvokingobject.multiply(1, 2, 3);
		sum();
		multiply(1,2,3); // both ways by class name or without class name because
					// multiply method is in same class
	}

}