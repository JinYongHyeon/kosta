package step5;
// Animal ��� Flyer�� �����Ѵ�
public class Bird extends Animal implements Flyer {

	@Override
	public void fly() {
		System.out.println("���� ����");
	}

}
