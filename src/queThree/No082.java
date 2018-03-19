package queThree;

public interface No082 {
	String s = "yo";

	public void method1();
}

interface BBB {
}

interface CCC extends No082, BBB {
	public void method1();

	public void method1(int x);
}
