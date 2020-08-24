package ioProject.model;

import java.util.Scanner;

public class TestIO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("******메뉴 선택을 해주세요******");
		try {
			while (true) {
				System.out.println("1번 디렉토리 2번  파일 3번 종료");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("1번");
					break;
				case 2:
					System.out.println("2번");
					break;
				case 3:
					System.out.println("종료");
					return;
				default:
					System.out.println("번호가 잘못 되었습니다. 다시 입력해주십시오.");
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
}
