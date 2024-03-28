package feb_10th;

class base {
	int code = 12;
	
	public void methodD()
	{
		System.out.println("base class");
	}
}

class derived extends base {
	int roll = 10;

	public void methodA() {
		System.out.println("code is" + code + "roll no is" + roll);
	}
}

public class inherMultiLevel2 extends derived  {

	void methodB() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		
		
		inherMultiLevel2 obj = new inherMultiLevel2();
		obj.methodB();
		obj.methodA();
		obj.methodD();
		

	}

}
