package step0723123123123123;

import java.util.HashMap;
import java.util.Scanner;

public class TestMap {

	public static void main(String[] args) {
		HashMap<String,String> login = new HashMap<String, String>();
		login.put("id", "qwer");
		login.put("password", "1234");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵�� �н����带 �Է����ּ���!");
		while(true) {
			if(sc.nextLine().equals(login.get("id"))) {
				System.out.println("ID : ");
	
			}else {
				
			}
		}
		
	}

}
