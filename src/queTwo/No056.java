package queTwo;

class Building {
}

public class No056 extends Building {
	public static void main(String[] args) {

		Building build1 = new Building();
		No056 barn1 = new No056();
		No056 barn2 = (No056) build1;
		Object obj1 = (Object) build1;
		// String str1 = (String)build1;
		Building build2 = (Building) barn1;
	}
}
