package step6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IOService {
	 /**
	  * path�� �̿��� ���丮 �����ϰ� ���� �����Ͽ� �Ű����� ����Ʈ�� ������ ���Ͽ� ����ϴ� �޼���
	  * @param path
	  * @param list
	  * @throws IOException
	  */
	public void saveFile(String path, Collection<String> list) throws IOException {
	//public void saveFile(String path, ArrayList<String> list) throws IOException {

		File f = new File(path);

		f.getParentFile().mkdir();
		PrintWriter pw = new PrintWriter(new FileWriter(path));
		/*for(int i=0;i<list.size();i++) {
			pw.println(list.get(i));
		}*/
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			pw.println(it.next());
		}
		pw.close();
	}
	
	/**
	 * path�� ���޵� ������ ������ �Է¹޾� ArrayList�� ��ȯ�ϴ� �޼���
	 * @param path:String
	 * @return ArrayList
	 * @throws IOException
	 */
	public ArrayList<String> readFile(String path) throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		
		while(br.ready()) {
			list.add(br.readLine());
		}
		br.close();
		return list;
	}
	


}
