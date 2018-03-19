package queThree;

class TestA {
	public void start() {
		System.out.println("TestA");
	}
}

public class No076 extends TestA {
	public void start() {
		System.out.println("TestB");
	}

	public static void main(String[] args) {
		((TestA) new No076()).start();
	}
}
