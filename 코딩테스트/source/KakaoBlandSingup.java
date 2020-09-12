package step2;

import java.util.regex.Pattern;
/* 
  								=====����=====
    1�ܰ� new_id�� ��� �빮�ڸ� �����Ǵ� �ҹ��ڷ� ġȯ�մϴ�.
	2�ܰ� new_id���� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� �����մϴ�.
	3�ܰ� new_id���� ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ�մϴ�.
	4�ܰ� new_id���� ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� �����մϴ�.
	5�ܰ� new_id�� �� ���ڿ��̶��, new_id�� "a"�� �����մϴ�.
	6�ܰ� new_id�� ���̰� 16�� �̻��̸�, new_id�� ù 15���� ���ڸ� ������ ������ ���ڵ��� ��� �����մϴ�.
     	���� ���� �� ��ħǥ(.)�� new_id�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ���ڸ� �����մϴ�.
	7�ܰ� new_id�� ���̰� 2�� ���϶��, new_id�� ������ ���ڸ� new_id�� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ���Դϴ�.
	
 */
public class KakaoBlandSingup {
	public static String b(String new_id) {
			
		Pattern pattern = Pattern.compile("(\\.)\\1{1,}");
		new_id = pattern.matcher(new_id).replaceAll("$1");
		System.out.println("3�ܰ� : "+new_id);
		return new_id;
	}

	public static String c(String new_id) {
		if (new_id.length() == 1 && new_id.contentEquals(".")) {
			new_id = "";
		} else if (new_id.startsWith(".") && new_id.endsWith(".")) {
			new_id = new_id.substring(1, new_id.length() - 1);
		} else if (new_id.startsWith(".")) {
			new_id = new_id.substring(1);
		} else if (new_id.endsWith(".")) {
			new_id = new_id.substring(0, new_id.length() - 1);
		}

		System.out.println("4�ܰ� : " + new_id);

		return new_id;

	}

	public static String a(String new_id) {
		String answer = "";

		// 1�ܰ� toLowerCase()[�ҹ��ڷ� ��ȯ]
		new_id = new_id.toLowerCase();
		System.out.println("1�ܰ�  : " + new_id);

		// ^y : y�� ������ ��� ��
		// 2�ܰ� �ҹ���, ����, ����, ����, ��ħǥ ���� ����
		new_id = new_id.replaceAll("[^a-z0-9-._\\-]", "");
		System.out.println("2�ܰ� : " + new_id);

		// 3�ܰ� ��ħǥ(.)2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ�� ġȯ
		new_id = b(new_id);

		// 4�ܰ� ó���� �� ��ħǥ(.) ����� ����
		new_id = c(new_id);
		// 5�ܰ� �� ���ڿ��̶�� a ����
		if (new_id.trim().contentEquals("") || new_id == null) {
			new_id = "a";
		}
		System.out.println("5�ܰ� : " + new_id);

		// 6�ܰ� 16�� �̻��̸� ó�� 15�ڸ� ������ ������ ����
		if (new_id.length() >= 16) {
			new_id = new_id.substring(0, 15);
			if (new_id.endsWith(".")) {
				new_id = new_id.substring(0, new_id.length() - 1);
			}
		}
		System.out.println("6�ܰ� : " + new_id);

		// 7�ܰ� ���� ���̰� 2�� ���ϸ� ������ ���� ���̰� 3�ɶ����� �ݺ� �ٿ��ֱ�
		while (new_id.length() < 3) {
			new_id += new_id.substring(new_id.length() - 1, new_id.length());
		}
		System.out.println("7�ܰ� : " + new_id);


		answer = new_id;
		return answer.trim();
	}

	public static void main(String[] args) {
		String test = "A-B23.-.S..D.C..@!..#.?...        d.DDDDDDn.../;ASD.";
		String test2 = "...!@BaT#*..y.abcdef        sddd    sghijklm";
		String test3 = "123_.def";
		String test4 = "abcd......efg.....hij.....lm.d..p";
		String test5 = "\"z-+.^.\"";
		String test6 = "=.=";
		System.out.println("���� : " + a(test4));
	}

}
