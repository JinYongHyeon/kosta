package step1;

public class CaesarPassword {
	public String a(String s, int n) {
		String answer = "";
		char arr[] = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			if(num>=65 && num<=90) { //�빮��
				num+=n;
				if(num>90)num-=26;
			}else if(num>=97 && num<=122) { //�ҹ���
				num+=n;
				if(num>122)num-=26;
			}
			System.out.println("num : " + num);
			arr[i] = (char) num;
			answer +=  Character.toString(arr[i]);
		}
		return answer;
	}

	public static void main(String[] args) {
		//n�� 1 �̻�, 25������ �ڿ����Դϴ�.
		String s = new CaesarPassword().a("A B", 25);
		System.out.println(s);
	}

}
