package step1;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();		
		
		queue.add("������  �氡�氡");
		queue.add("�氡 �氡....");
		queue.add("������!!");
		queue.add("���� �����̿�...");
		/*
		//�������� ������ȯ , ���� ���� �� ������ ���´�.
		System.out.println(queue.peek());
		System.out.println(queue.poll()); // ���� ����
		*/
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
		System.out.println(queue);
		
		
	}

}
