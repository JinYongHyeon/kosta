package step1;

public class WeirdText {
	public String a(String s) {
		String arr[] = s.split("");
		boolean odd = true;
		StringBuilder sb= new StringBuilder();
		for(String t : arr) {
			if(t.equals(" ")) {
				sb.append(t);
				odd = true;
				continue;
			}
			if(odd) {
				sb.append(t.toUpperCase());
				odd=false;
			}else {
				sb.append(t.toLowerCase());
				odd=true;
			}
			
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		new WeirdText().a("try hello world");
	}

}
