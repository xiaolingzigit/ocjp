package queThree;

interface A {
	public void aMethod();
}

interface B {
	public void bMethod();
}

interface C extends A, B {
	public void cMethod();
}

class D implements B {
	public void bMethod() {
		System.out.println("D");
	}
}

class E extends D implements C {
	public void aMethod() {
	}

	public void bMethod() {
		System.out.println("E");
	}

	public void cMethod() {
	}
}

public class No071 {
	public static void main(String[] args) {
		D e = new E();
		e.bMethod();
	}
}
