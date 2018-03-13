package queTwo;

class One {
	public One foo() {
		return this;
	}
}

class Two extends One {
	public One foo() {
		return this;
	}
}

class Three extends Two {
	// insert method here
	// public void foo(){}
	// public int foo(){return 3;}
	// public Two foo(){return this;}
	// public One foo(){return this;}
	// public Object foo(){return this;}
}
