package queTwo;

class Foo3 {
	public int a = 3;

	public void addFive() {
		a += 5;
		System.out.print("f ");
	}
}

class Bar extends Foo3 {
	public int a = 8;

	public void addFive() {
		this.a += 5;
		System.out.print("b ");
	}
}

public class No062 {

	public static void main(String[] args) {
		//什么情况下调用父类的方法，什么情况下调用子类的方法。
		Foo3 f = new Bar();
		f.addFive();
		System.out.println(f. a);
	}

}
