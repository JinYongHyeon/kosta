package dddddd;

public class PolyArgumentTest3 {

	public static void main(String[] args) {
		//�θ� money bounsPoint 
		
		Buyer b= new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		Autdio audio = new Autdio();
		
		b.buy(tv);//tv �����Ͽ����ϴ�.
		b.buy(com);//Computer �����Ͽ����ϴ�.
		b.buy(audio);//Audio �����Ͽ����ϴ�.
	//	b.summary();//�����Ͻ� ��ǰ�� TVm Computer,Audio�Դϴ�.
		System.out.println();
//		b.refund(com); // Computer�� ��ǰ�ϼ̽��ϴ�.
//		b.summary(); // �����Ͻ� ��ǰ�� �ѱݾ��� 150�����Դϴ�. �����Ͻ� ��ǰ�� Tv , Audio
	}

}
