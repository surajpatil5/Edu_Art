package feb_3rd;

import java.util.Scanner;

/*program getting input from user/keyboard using object in class*/
public class sample1 {

	int a, b, c;
	String name;
	
	Scanner sc = new Scanner(System.in);
	
	public void getValueForMulti() {
		
		System.out.println("enter value for a");
		a = sc.nextInt();
		
		System.out.println("enter value for b");
		b = sc.nextInt();
		
		System.out.println("enter value for name");
		name = sc.next();
	 
	}

	public void Multi() {
		
		c = a * b;
		System.out.println("multipication of a & b is:" + c);
	}
	
	public void PrintingName()
	{
		System.out.println(name);
	}

	public static void main(String[] args) {

		sample1 obj = new sample1();
		
		obj.getValueForMulti();
		obj.Multi();	

		
	}

}
