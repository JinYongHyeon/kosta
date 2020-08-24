package step5;

class Zoo {
	//�������� ����� �Ű������� ó���ϸ� Animal �ڽ� ��ü�� �������� ������� �ϳ��� �޼��忡�� ��� ó���� �� �ִ�. ���� �� ����
	public void pass(Animal p) {
		p.eat();
	}

	/* �̿� ���� ��ü�� ������ ���� ������ ��� �̿� �����ϴ� ó�� �޼���� ��� �����Ǿ�� �Ѵ�.
	 * �ý����� ���յ��� ���� ������������ ���� �ʴ�.
	 * 
	 * public void pass(Person p) { p.eat(); }
	 * public void pass(Monkey m) { p.eat();}
	 */
}

public class TestPolymorphism2 {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		zoo.pass(new Person());
		zoo.pass(new Monkey());
		// �� �� �������� �پ��� ������ ��ü�� �ִٰ� ����
	}

}
