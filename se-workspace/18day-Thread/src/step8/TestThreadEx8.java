package step8;

import java.io.File;
import java.util.Random;

/** Random method 
 * MakeFileWorker Thread�� ������ ����ŭ ������ �ð� �������� �����ϰ� ������ ����(0.avi or 1.mp3) �Ͽ� CommonInfo�� MAKE_PATH��  �����Ѵ�
 * 
 * MoveFileWorker Thread�� MAKE_PATH�� ����� ���ϵ��� Ȯ���ڿ� ���� MOVIE_PATH �� MUSIC_PATH�� �̵���Ų��. ������ ����ŭ ������ �ð��������� �̵���Ų��.
 * 
 * @author kosta
 *
 */
public class TestThreadEx8 {

	public static void main(String[] args) {
		int makeCount=30;//������ ���ϼ�
		int makePeriod=1000;//1�� �������� ����
		
		int moveCount = 5; //�̵���ų �۾���
		int movePeriod=7000; //7�ʰ��� �̵�
		
		MoveFileWorker moveFileWorker = new MoveFileWorker(moveCount,movePeriod);
		MakeFileWorker makeFileWorker = new MakeFileWorker(makeCount,makePeriod);
		
		Thread t = new Thread(moveFileWorker);
		Thread t1 =  new Thread(makeFileWorker);
		
		t1.start();
		t.start();

	
	}	

}
