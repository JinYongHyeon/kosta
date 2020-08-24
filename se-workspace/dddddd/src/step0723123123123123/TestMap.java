package step0723123123123123;

import java.util.HashMap;
import java.util.Scanner;

public class TestMap {

	public static void main(String[] args) {
		HashMap<String,String> login = new HashMap<String, String>();
		login.put("id", "qwer");
		login.put("password", "1234");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디와 패스워드를 입력해주세요!");
		while(true) {
			if(sc.nextLine().equals(login.get("id"))) {
				System.out.println("ID : ");
	
			}else {
				
			}
		}
		
	}

}
