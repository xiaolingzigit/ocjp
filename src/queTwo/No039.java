package queTwo;

public class No039 {
	private final int id;

	public No039(int id) {
		this.id = id;
	}

	// public void updateId(int newId){id = newId;}

	public static void main(String[] args) {
		No039 fa = new No039(42);
		// fa.updateId(69);
		System.out.println(fa.id);
	}
}
