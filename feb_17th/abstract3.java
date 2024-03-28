package feb_17th;

//abstract class using interface & abstract method//

// If we implement any interface in normal class then we have to compulsory implement all the methods in that class

// if we Implement any interface in abstract class then we don't need to implement all the methods in abstract class

interface A {
	void a();

	void b();

	void c();

	void d();
}

 abstract class B implements A {
	public void c() {
		System.out.println("I am C");
	}
}

class M extends B {
	public void a() {
		System.out.println("I am a");
	}

	public void b() {
		System.out.println("I am b");
	}

	public void d() {
		System.out.println("I am d");
	}
}

class abstract3 {
	public static void main(String args[]) {
		M obj = new M();

		obj.a();
		obj.b();
		obj.c();
		obj.d();
	}
}