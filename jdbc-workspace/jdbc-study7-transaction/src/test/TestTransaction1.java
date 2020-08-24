package test;

import model.CardDAO;
import model.CardDAO2;

/**
 * 트랜잭션 처리가 되지 않았을 때 발생되는 문제를 확인하는 예제 카드 테이블에 카드 정보가 insert가 되고 포인트 테이블에 포인트 정보가
 * insert 될 때 문제가 발생되었을 때 포인트 정보는 등록되지 않고 카드 정보만 존재하는 경우를 만들어 본다. -> 논리적 오류
 * 
 * @author kosta
 *
 */
public class TestTransaction1 {

	public static void main(String[] args) {
		try {
			CardDAO dao = new CardDAO();
			dao.registerCardAndPoint("java2", "장기하", "롯데", 1000); // id, name , point_type,point
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("카드 발급과정에 오류가 발급이 되지 않았습니다.");
		}
	}

}

