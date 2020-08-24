package step2;

/*
 * java.lang ��Ű���� �⺻���� ����� �� �ִ� ��Ű����.
 * java.lang.String class�� �޼��带 ����� ���� ����
 */
public class TestStringAPI {

	public static void main(String[] args) {
		String str = "ȫ�浿,������,��þ�,������";
		System.out.println(str);
		// �� ���ڿ���,�� �������� �����ؼ� �迭�� �����ϰ� �ʹٸ� String class���� �����ϴ� split()�� ����ϸ� �ȴ�.
		String[] array = str.split(",");
		System.out.println(array.length);

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		String name1 = "������";
		// name1�� ��� ���ڷ� ����
		System.out.println(name1.length());
		// ������ ���۵Ǵ� ���ڿ����� ���� Ȯ�� true, false
		System.out.println(name1.startsWith("��"));
		System.out.println(name1.startsWith("��"));
		System.out.println(name1.startsWith("��"));
		System.out.println("**�ڹ� ���ڿ� ��**");
		String angel="������";
		String angel2="�ڽ���";
		System.out.println(angel == angel2);
		String angel3=new String("������");
		System.out.println(angel3);
		//���� ������ ���ڿ������� ����� ��Ŀ� ���� �Ʒ� == �����ڴ� ���ڿ� �񱳿� �������� �ʴ�. ������ ��� true�� ��ȯ���� �ʴ´�.
		System.out.println(angel == angel3);
		//�ڹ� ���ڿ� �񱳽ÿ��� �ݵ�� String���� �����ϴ� equals() �޼ҵ带 �̿��ؾ� �Ѵ�.
		System.out.println(angel.equals(angel3));
	}

}
