package step4;

public class TestArray1 {

	public static void main(String[] args) {
		int age[]; // �迭 ���� int[] age
		age = new int[3]; // �迭 ��ü ����
		age[0] = 10; // �迭 ù��° �濡 10�� ����
		age[1] = 14;
		age[2] = 20;
		System.out.println(age.length); //�迭 ����
		/*
		 * for (int i = 0; i < age.length; i++) { System.out.println(age[i]); }
		 */
		
		/*
		 * ������ for�� 
		 */
		for(int i : age) {
			System.out.println(i);
		}
	}

}
