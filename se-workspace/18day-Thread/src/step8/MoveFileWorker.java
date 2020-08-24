package step8;

import java.io.File;
import java.nio.file.FileAlreadyExistsException;

public class MoveFileWorker implements Runnable, CommonInfo {

	private int moveCount; // 이동시킬 작업수
	private int movePeriod; // 시간간격

	public MoveFileWorker(int moveCount, int movePeriod) {
		this.moveCount = moveCount;
		this.movePeriod = movePeriod;
	}

	public int getMoveCount() {
		return moveCount;
	}

	public void setMoveCount(int moveCount) {
		this.moveCount = moveCount;
	}

	public int getMovePeriod() {
		return movePeriod;
	}

	public void setMovePeriod(int movePeriod) {
		this.movePeriod = movePeriod;
	}

	public void move() throws InterruptedException {
		File dir = new File(MAKE_PATH);
		File musicDir = new File(MUSIC_PATH);
		File movieDir = new File(MOVIE_PATH);

		if (musicDir.isDirectory() == false)
			musicDir.mkdirs();
		if (movieDir.isDirectory() == false)
			movieDir.mkdirs();

		for (int i = 0; i < moveCount; i++) {
			Thread.sleep(movePeriod);
			/*
			 * File list[] = dir.listFiles(); for (int j = 0; j < list.length; j++) { if
			 * (list[j].isFile()) { if (list[j].getName().endsWith(".mp3")) {
			 * list[j].renameTo(new File(MUSIC_PATH + File.separator + list[j].getName()));
			 * } else { list[j].renameTo(new File(MOVIE_PATH + File.separator +
			 * list[j].getName())); } } }
			 */
			listMove();

		}
		listMove();
	}

	public void listMove() {
		File dir = new File(MAKE_PATH);
		File list[] = dir.listFiles();

		for (int j = 0; j < list.length; j++) {
			if (list[j].isFile()) {
				File f = null;
				if (list[j].getName().endsWith(".mp3")) {
					f = new File(MUSIC_PATH + File.separator + list[j].getName());	
				} else {
					f = new File(MOVIE_PATH + File.separator + list[j].getName());
				}
				list[j].renameTo(f);
			}
		}
	}

	@Override
	public void run() {
		try {
			move();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
