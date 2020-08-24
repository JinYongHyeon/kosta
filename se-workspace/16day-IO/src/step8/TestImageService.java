package step8;

import java.io.IOException;

public class TestImageService {

	public static void main(String[] args) {
		String copyPath = "C:\\kosta203\\iotest4\\runaway.jpeg";
		String pastePath = "C:\\kosta203\\iotest3\\บนป็บป-runaway.jpeg";
		ImageService service = new ImageService();
		try {
			service.copyAndPasteImage(copyPath,pastePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
