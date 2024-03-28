package feb_25th;

// program with returning value with invoking/using object

public class programwithreturningvalue 
{ 
	int a, b, c;
	int result;
	
	public int multiply(int a, int b, int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		result = a*b*c;
		System.out.println(result);
		return result;
	}
	public String methodname()
	{
		String name ="prafull";
		System.out.println(name);
		return name;
	}
	
	public static void main(String[] args) 
	{
		programwithreturningvalue obj = new programwithreturningvalue();
		
		int x = obj.multiply(1, 2, 3);
		
		System.out.println(x);
		
		int Z;
		
		int d=50;
		
		Z = x*d;
		
		System.out.println(Z);
		
		obj.methodname();
	
		String eduart = obj.methodname();
		
		System.out.println(eduart);
		
	}

}
