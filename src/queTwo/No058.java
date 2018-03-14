package queTwo;

interface Foo2 {
}

class Alpha implements Foo2 {
}

class Beta extends Alpha {
}

public class No058 extends Beta {
	public static void main(String[] args) {
		Beta x = new Beta();
		// insert code here
		Alpha a = x;
		// Foo f = (Delta)x;
		Foo2 f = (Alpha) x;
		Beta b = (Beta) (Alpha) x;
	}
}
