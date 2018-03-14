package queTwo;

import java.util.ArrayList;

public class No046 {
	ArrayList toppings;

	public final void addTopping(String topping) {
		toppings.add(topping);
	}

	public void removeTopping(String topping) {
		toppings.remove(topping);
}
}
class PepperoniPizza extends No046 {
	// public void addTopping(String topping){
	// System.out.println("Cannot add Toppings");
	// }

	public void removeTopping(String topping) {
		System.out.println("Cannot remove pepperoni");
	}

}