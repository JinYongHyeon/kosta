package step1;

import java.util.Arrays;

public class Solution {

	public int solution(int n) {

		int aswer = 0;

		for (int i = 2; i <= n; i++) {
			boolean asd = true;
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					asd = false;
					break;
				}
			}
			if (asd) {
				++aswer;
			}

		}

		return aswer;

	}

	public String solution2(int n) {
		String answer = "";
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				answer += "박";
			} else {
				answer += "수";
			}
			System.out.println(answer);
		}
		return answer;
	}

	public int solution(String s) {
		int answer = 0;
		answer = Integer.parseInt(s);
		System.out.println(answer);
		return answer;
	}

	public String solution(String[] seoul) {
		String answer = "";
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				answer = "김서방은 " + i + "에 있다.";
			}
		}
		return answer;
	}

	public String solution3(String s) {
        String answer = "";
        
        System.out.println(s.substring(3,5));
        
        
        char c[] = new char[s.length()]; 
        
        for(int i=0;i<s.length();i++){
            if(i%s.length()==0){
                answer = s.substring(s.length()/2-1,s.length()+2-1);
            }else{
            	 answer = s.substring(s.length()/2,s.length()+1);
            }
        }
        System.out.println(answer);
        return answer;
    }



	public static void main(String[] args) {
		Solution s = new Solution();
		long start = System.currentTimeMillis();
		System.out.println(s.solution(5));
		long end = System.currentTimeMillis();
		System.out.println("수행시간 : " + (end - start));

		s.solution2(5);

		String a = s.solution(new String[] { "Jane", "Kim" });
		System.out.println(a);
		
		s.solution3("asdfgqwer");

	}

}

/*
 * for (int j = 1; j <= i; j++) { if (i % j == 0) { count++; if (count >
 * 3)break;
 * 
 * } }
 */
