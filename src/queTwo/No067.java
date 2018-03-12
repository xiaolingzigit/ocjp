package queTwo;

public abstract class No067 {
	protected abstract double getSalesAmount();

	public double getCommision() {
		return getSalesAmount() * 0.15;
	}
}
 class Sales extends No067 {
	 //insert method here
//	 double getSalesAmount() { return 1230.45; }
//	 public double getSalesAmount() { return 1230.45; }
//	 private double getSalesAmount() { return 1230.45; }
	 protected double getSalesAmount() { return 1230.45; }

 }

