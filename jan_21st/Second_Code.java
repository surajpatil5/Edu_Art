package jan_21st;

//this code is used to perform sum & mul operations 

public class Second_Code {

	public void sum() {
		int a = 10;
		int b = 20;
		int c;

		c = a + b;

		System.out.println(c);
	}

	public void mul() {
		int p = 10;
		int q = 20;
		int S;

		S = p * q;

		System.out.println(S);
	}

	public static void main(String[] args) {
		
		//syntax
		
		//class name object name = new classname()
		
		// object name can be anything 
		
		Second_Code obj = new Second_Code();
		
		obj.sum();
		obj.mul();
		
		

	}

}
