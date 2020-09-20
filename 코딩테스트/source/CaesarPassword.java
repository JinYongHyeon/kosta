package step1;

public class CaesarPassword {
	public String a(String s, int n) {
		String answer = "";
		char arr[] = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			if(num>=65 && num<=90) { //대문자
				num+=n;
				if(num>90)num-=26;
			}else if(num>=97 && num<=122) { //소문자
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
		//n은 1 이상, 25이하인 자연수입니다.
		String s = new CaesarPassword().a("A B", 25);
		System.out.println(s);
	}

}
