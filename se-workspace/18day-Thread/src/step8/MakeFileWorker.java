package step8;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class MakeFileWorker implements Runnable, CommonInfo {

	private int makeCount;
	private int makePeriod;

	public MakeFileWorker(int makeCount, int makePeriod) {
		super();
		this.makeCount = makeCount;
		this.makePeriod = makePeriod;
	}

	public int getMakeCount() {
		return makeCount;
	}

	public void setMakeCount(int makeCount) {
		this.makeCount = makeCount;
	}

	public int getMakePeriod() {
		return makePeriod;
	}

	public void setMakePeriod(int makePeriod) {
		this.makePeriod = makePeriod;
	}

	public String createFileName(int name) {
		Random random = new Random();
		if (random.nextBoolean())
			return name + ".mp3";
		else
			return name + ".avi";
	}


	public void createFile() throws InterruptedException, IOException {
			File f = new File(MAKE_PATH);
			if(f.isDirectory()==false) f.mkdirs();
		for (int i = 0; i < makeCount; i++) {
			File dir = new File(MAKE_PATH + File.separator + createFileName(i));
			dir.createNewFile();
			System.out.println(dir.getName() + "파일생성");
			Thread.sleep(makePeriod);
		}
	
	}

	@Override
	public void run() {
		try {
			createFile();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
