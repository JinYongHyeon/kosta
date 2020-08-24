package step1;

import java.util.Stack;

//Stack : LIFO (Last in First out)
public class TestStack {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>(); //�ӽ��������

		stack.push("a");
		stack.push("b");
		stack.push("c");

		System.out.println(stack);
		
		System.out.println(stack.peek()); //�������� ��ȯ
		
		System.out.println("***************************");
		/*
		System.out.println(stack.pop()); //����, stack���� ����
		System.out.println(stack.pop());
		*/
		
		while(!stack.empty()) {
			System.out.print(stack.pop());
		}
		System.out.println(stack);
	}
}
