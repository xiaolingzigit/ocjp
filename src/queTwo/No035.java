package queTwo;

public class No035 {
	String title;
	int value;

	public No035() {
		title += " World";
	}

	public No035(int value) {
//		this();
		this.value = value;
		title = "Hello";

		// No035();
	}

	public static void main(String[] args) {
		No035 c = new No035(5);
		System.out.print(c.title);
	}
}
