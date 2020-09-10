package step1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySolution {
	/**
	 * 완주하지 못한 선수
	 * 
	 * @param participant
	 * @param completion
	 * @return
	 */
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		Arrays.sort(participant);
		Arrays.sort(completion);
		int index = 0;

		exit: for (int i = 0; i < participant.length; i++) {
			index = i;
			if (index == participant.length-1)
				index = index - 2;
			if (!participant[i].equals(completion[index])) {
				answer = participant[i];
				break exit;
			}

		}
		return answer;
	}

	public static void main(String[] args) {
		ArraySolution as = new ArraySolution();
		String participant[] = { "leo", "kiki", "eden" }; // 뛴 선수 명단
		String completion[] = { "eden", "kiki" }; // 완주한 선수
		// String participant[] = { "marina", "josipa", "nikola", "vinko", "filipa" };
		// String completion[] = { "josipa", "filipa", "marina", "nikola" };
		// String participant[] = { "mislav", "stanko", "mislav", "ana" };
		// String completion[] = { "stanko", "ana", "mislav" };
		String name = as.solution(participant, completion);
		System.out.println("이름 : " + name);
	}

}
