package step1;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();		
		
		queue.add("원딜님  방가방가");
		queue.add("방가 방가....");
		queue.add("대답안해!!");
		queue.add("바텀 오픈이요...");
		/*
		//삭제없이 정보반환 , 가장 먼저 들어간 정보가 나온다.
		System.out.println(queue.peek());
		System.out.println(queue.poll()); // 추출 삭제
		*/
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
		System.out.println(queue);
		
		
	}

}
