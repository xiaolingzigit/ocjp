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
	//Ϊ������������ʸ�����޲ι��������������η������protected
	protected No065() {
	}
//	protected No065 create() {
//		return new No063();
//	}
	//��̬�������ܵ���ʵ��������
	static No065 create() {
		return new No065();
	}
}

class SingleSub extends No065 {
}
