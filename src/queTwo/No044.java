package queTwo;

class Employee {
	String name;
	double baseSalary;

	public Employee(String name, double baseSalary) {
		this.name = name;
		this.baseSalary = baseSalary;
	}
}

public class No044 extends Employee {
	double commission;

	public No044(String name, double baseSalary, double commission) {
		// insert code here
		// A
		super(name, baseSalary);
		// B.
		this.commission = commission;
		// C.
//		super();
//		this.commission = commission;
		// D.
//		this.commission = commission;
//		super();
		// E.
//		super(name, baseSalary);
//		this.commission = commission;
		// F.
//		this.commission = commission;
//		super(name, baseSalary);
		// G.
		//super(name, baseSalary, commission);
	}
}