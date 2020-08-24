package step1;

import java.util.Stack;

//Stack : LIFO (Last in First out)
public class TestStack {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>(); //임시저장공간

		stack.push("a");
		stack.push("b");
		stack.push("c");

		System.out.println(stack);
		
		System.out.println(stack.peek()); //삭제없이 반환
		
		System.out.println("***************************");
		/*
		System.out.println(stack.pop()); //추출, stack에서 삭제
		System.out.println(stack.pop());
		*/
		
		while(!stack.empty()) {
			System.out.print(stack.pop());
		}
		System.out.println(stack);
	}
}
