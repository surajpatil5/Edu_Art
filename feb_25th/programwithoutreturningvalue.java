package feb_25th;

//program without returning value with invoking/using object

public class programwithoutreturningvalue {
	int a = 10, b = 20, c = 30;
	int x;
	
	public void multiply() {
		
		String name = "prafull";
		System.out.println(name);
		
		x = a * b * c;
		System.out.println(x);
		
	}

	public static void main(String[] args) {
		programwithoutreturningvalue obj = new programwithoutreturningvalue();
		obj.multiply();
		
		programwithreturningvalue obj1 = new programwithreturningvalue();
		
		int w =20;
		
		int p = obj1.multiply(2, 3, 4);
		
		int z = w+p;
		
		System.out.println(z);
		
	}		
}
