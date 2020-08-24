package step6;

/*
 * 자바 스레드 스케줄링은 우선 순위 방식을 채택 이를 확인하는 예제 
 * 테스트 스레드 20개 생성해 start시키고 그 중 하나를 우선순위를 가장 높게 설정한 다음 결과를 확인 . 
 */
class Worker implements Runnable {

	@Override
	public void run() {
		// 현재 실행중인 스레드 이름을 반환받는다.
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		for (long i = 0; i < 900000000; i++) {
			//System.out.println(name);
		}
		System.out.println(name+"스레드 실행완료! 우선순위 : "+priority);
	}

}

public class TestThread6 {

	public static void main(String[] args) {
		Worker w = new Worker();
		/*Thread t1 = new Thread(w,"1번쨰 일꾼 스레드");
		t1.setPriority(9);
		t1.start();*/
		//20개의 스레드를 생성하고 start하되 9번째 스레드는 우선순위를 10으로 할당한다.
		for(int i=1;i<=20;i++) {
			Thread t = new Thread(w,i+"번쨰 일꾼 스레드");
			if(i == 9)t.setPriority(9);
			t.start();
		}
		System.out.println("***main thread 시작***");
		System.out.println("***main thread 종료***");
	}

}
