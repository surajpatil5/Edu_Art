package feb_17th;

 abstract class car
 {
	 public void wheels()
	 {
		 System.out.println("having wheels");
		 
	 }
	 public void seat()
	 {
		 System.out.println("Having seat");
		 
	 }
	 public abstract void engine();
	 
	 public abstract void battery();
	 
 }

 public class abstractexample1  extends car
{
	public void engine()
	{
		System.out.println("engine");
	}
	
	public void battery()
	{
		System.out.println("battery");
	}

public static void main(String[] args) 
	{
	// create object
	abstractexample1 obj = new abstractexample1();
	obj.battery();
	obj.engine();
	obj.seat();
	obj.wheels();

	}



}
