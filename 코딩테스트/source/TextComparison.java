package step1;

public class TextComparison {

	public boolean a(String s) {
		boolean answer = true;
		s = s.toLowerCase();
		s = s.replaceAll("[^p,y]", "");
		String arr[] = s.split("");
		int pointP = 0;
		int pointy = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("p")) {
				pointP++;
			} else if (arr[i].equals("y")) {
				pointy++;
			}

		}
		if(pointP != pointy)answer=false;
		return answer;
	}

	public static void main(String[] args) {
		boolean b = new TextComparison().a("ddssadas");
		System.out.println(b);
	}
}
