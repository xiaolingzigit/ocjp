package queTwo;

public class No049 {

	public int update(int quantity, int adjust) {
		quantity = quantity + adjust;
		return quantity;
	}

	public void callUpdate() {
		int quant = 100;
		quant = update(quant, 320);
		System.out.println("The quantity is " + quant);
	}
	public static void main(String[] args) {
		new No049().callUpdate();
	}
}