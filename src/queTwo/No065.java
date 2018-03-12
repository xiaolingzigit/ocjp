package queTwo;

public class No065 {
	private static No065 instance;
	public static No065 getInstance() {
		if (instance == null)
			instance = create();
		return instance;
	}

//	private No065() {
//	}
	//为了能让子类访问父类的无参构造器，访问修饰符最好用protected
	protected No065() {
	}
//	protected No065 create() {
//		return new No063();
//	}
	//静态方法不能调用实例方法。
	static No065 create() {
		return new No065();
	}
}

class SingleSub extends No065 {
}
