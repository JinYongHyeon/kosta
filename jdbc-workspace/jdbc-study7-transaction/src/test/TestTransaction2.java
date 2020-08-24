package test;

import model.CardDAO2;

/**
 * 트랜잭션 처리가 되지 않았을 때 발생되는 문제를 확인하는 예제 카드 테이블에 카드 정보가 insert가 되고 포인트 테이블에 포인트 정보가
 * insert 될 때 문제가 발생되었을 때 포인트 정보는 등록되지 않고 카드 정보만 존재하는 경우를 만들어 본다. -> 논리적 오류
 * 
 * @author kosta
 * 트랜잭션 처리를  통해 모든 작업이 정상적으로 수행되었을 떄 COMMIT 문제발생시 ROLLBACK
 * 
 * 테스트 1 : 정상적으로 데이터를 입력해 COMMIT 확인
 * 테스트 2 : POINT 등록시 고의로 오류를 발생시켜 ROLLBACK이 되는 지 확인
 */
 class TestTransaction2 {

	public static void main(String[] args) {
		try {
			CardDAO2 dao = new CardDAO2();
			dao.registerCardAndPoint("java2", "장기하", "롯데", 1000); // id, name , point_type,point
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}