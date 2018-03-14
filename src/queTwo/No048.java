package queTwo;

public class No048 {
	public static void main(String[] args) {
		int[] x = { 1, 2, 3 };
		int y[] = { 4, 5, 6 };
		new No048().go(x, y);
	}

	void go(int[]... z) {
		
		for (int[] a : z)
			
			System.out.print(a[0]);
	}
}
