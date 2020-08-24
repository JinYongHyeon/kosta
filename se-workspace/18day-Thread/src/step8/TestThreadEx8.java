package step8;

import java.io.File;
import java.util.Random;

/** Random method 
 * MakeFileWorker Thread는 지정한 수만큼 지정한 시간 간격으로 랜덤하게 파일을 생성(0.avi or 1.mp3) 하여 CommonInfo의 MAKE_PATH에  저장한다
 * 
 * MoveFileWorker Thread는 MAKE_PATH에 저장된 파일들을 확장자에 따라 MOVIE_PATH 와 MUSIC_PATH에 이동시킨다. 지정한 수만큼 지정한 시간간격으로 이동시킨다.
 * 
 * @author kosta
 *
 */
public class TestThreadEx8 {

	public static void main(String[] args) {
		int makeCount=30;//생생할 파일수
		int makePeriod=1000;//1초 간격으로 생성
		
		int moveCount = 5; //이동시킬 작업수
		int movePeriod=7000; //7초간격 이동
		
		MoveFileWorker moveFileWorker = new MoveFileWorker(moveCount,movePeriod);
		MakeFileWorker makeFileWorker = new MakeFileWorker(makeCount,makePeriod);
		
		Thread t = new Thread(moveFileWorker);
		Thread t1 =  new Thread(makeFileWorker);
		
		t1.start();
		t.start();

	
	}	

}
