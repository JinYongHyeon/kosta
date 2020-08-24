package step6;
//abstract class : �ڽĿ��� ������ ����� ��ӽ�Ű�� ������ ��üȭ���� �ʴ´�. / �ڽ� ��ü������ ���ؼ� ��ü������ �ȴ�.
public abstract class PizzaService {
	
	protected void  prepare() {
		System.out.println("���츦 �����");
	}
	//�θ� �������� ������ �� ����, �ݵ�� �ڽ� Ŭ�������� �����ؾ� �ϴ� �޼���
	protected abstract void topping();
	
	protected void bake() {
		System.out.println("����");
	}
	
	protected void cutting() {
		System.out.println("�ڸ���");
	}
	
	protected void boxing() {
		System.out.println("�����ϴ�");
	}
	/**
	 * �ܺο��� ���ϰ� ����� �� �ֵ��� �޼��带 ����
	 * ���ø� �޼��� ����
	 * ���ø� �޼���� ������ �۾� ������ �����ؼ� �ڽĿ��� �����ش�.
	 */
	public void makePizza() {
		prepare();
		topping();
		bake();
		cutting();
		boxing();
	}
}

//�߻� Ŭ���� ���� ����� �������ֵ� �ڽĿ��� ��������� �� �Ŵ� �߻� �޼ҵ�� ����� ����� �ȹ��� Ÿ Ŭ�������� �� �� ���� ��ü ������ ���Ͽ� �ý��� ���ʿ��� ȣ�� ������ ���ؼ� �Ѵ�?