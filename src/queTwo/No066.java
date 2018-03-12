package queTwo;

class Thingy {
	Meter m = new Meter();
}
class Component {
	void go() {
		System.out.print("c");
	}
}
class Meter extends Component {
	void go() {
		System.out.print("m");
	}
}
public class No066 extends Thingy {
	public static void main(String[] args) {
		No066 dt = new No066();
		dt.m.go();
		Thingy t = new No066();
		t.m.go();
	}
}