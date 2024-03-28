package feb_10th;

// Multilevel inheritance

class E 
{
	public void methodA() 
	{
		System.out.println("Grand-Parent class");
	}
}
  class F extends E
 {
	public void methodB() 
	{
		System.out.println("Parent class");
	}
}
  																																										
public class inherMultiLevel1 extends F
	{
	public void methodC() {
		System.out.println("Child Class");
	}
	
	public static void main(String[] args) 
	{
		inherMultiLevel1 obj = new inherMultiLevel1();
		obj.methodA();
		obj.methodB();
		obj.methodC();
	}

}
