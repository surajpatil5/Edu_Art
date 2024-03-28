   package feb_18th;

/* here we give same name to methods & we call them so 
 that is overloading */

class load {
	int a, b, c, d;   // class level 
	
	public void get(int a,int b) {
		this.a = a;
		this.b = b;
		System.out.println("value of numbers" + a + " " + b);
	}

	public void get(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;

		System.out.println("value of numbers" + a + " " + b + " " + c + " " + d);
	}
	
	public void get(int a, int b, int c,String name) {
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println("value of numbers" + a + " " + b + " " + c + " " + d);
	}
	
	public void sum()
	{
		int Result=a+b+c+d;
		System.out.println(Result);
	}
}

public class methodoverloading {

	public static void main(String args[]) {
		
		load obj = new load();
		
		obj.get(1, 2, 3, 4);
		
		obj.sum();
		
		obj.get(10,20 );
		
		obj.get(0, 0, 0, 0);
		
	}

}
