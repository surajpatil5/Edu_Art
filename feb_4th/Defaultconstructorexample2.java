package feb_4th;

public class Defaultconstructorexample2 {
	
	int id;
	String name;
	
	public void display ()
	{
		System.out.println(id+"  "+name);
		
	}

	public static void main(String[] args) {
		
		Defaultconstructorexample2 obj = new Defaultconstructorexample2();
		obj.display(); 

	}

}
