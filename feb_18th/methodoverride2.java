package feb_18th;

class supr {
	int x = 10;

	public void disp() {
		System.out.println("supr" + x);
	}
	
	public void sum()
	{
		
	}
}
class sub extends supr {
	int x = 20;

	public void disp() {
		System.out.println("sub" + x);
		
	}
}
public class methodoverride2 extends sub {

	public static void main(String[] args) {
		methodoverride2 obj = new methodoverride2();
		//sub obj = new sub();
		obj.disp();
		obj.sum();
	}

}
