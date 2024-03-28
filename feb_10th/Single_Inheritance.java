package feb_10th;

 class new_inheritnance_single {
	public void sum() {
		System.out.println("Sum machanisum");
	}
}

public class Single_Inheritance extends new_inheritnance_single {

	public void mul() {
		System.out.println("Multiplication machanisum");
	}

	public static void main(String[] args) {

		Single_Inheritance obj = new Single_Inheritance();
		obj.sum();
		obj.mul();

	}

}
