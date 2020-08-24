package step7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class CopyAndPasteService {
	public void copyFile(String copyPath, String pastePath) throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		new File(pastePath).getParentFile().mkdirs();
		BufferedReader br = null;
		PrintWriter pw = null;
		// new File(copyPath).getParentFile().mkdirs();
		try {
			br = new BufferedReader(new FileReader(copyPath));
			while (br.ready()) {
				list.add(br.readLine());
			}

			pw = new PrintWriter(new FileWriter(pastePath));

			for (int i = 0; i < list.size(); i++) {
				pw.println(list.get(i));
			}

		} finally { //예외 발생시에도 반드시 스트림을 닫아준다.
			if (br != null)
				br.close();
			if (pw != null)
				pw.close();
		}

	}
}
