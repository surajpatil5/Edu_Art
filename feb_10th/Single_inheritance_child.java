package feb_10th;

public class Single_inheritance_child extends Single_Inheritance_Parent{
	
	public void mul()
	{
		System.out.println("Mul machanisum");
	}

	public static void main(String[] args) {
		
		Single_inheritance_child obj = new Single_inheritance_child();
		obj.sum();
		obj.mul();

	}

}
