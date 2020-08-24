package step2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//��½�Ʈ���� �̿��� ������ �����ϰ� �����͸� ����ϴ� ����
public class TestOutput1 {

	public static void main(String[] args) {
		//���丮�� ����, �����ϸ� �������� �ʴ´�.
		File dir = new File("C:\\kosta203\\iotest");
		boolean result = dir.mkdir(); //mkdir�� ���� ���丮 ������ ������ ������ �� ����� mkdirs�� ���� ���丮 ������ ������ �װ͵� ���� ���� �����Ѵ�.
		System.out.println("���丮 ����"+result);
		
		try {
			//Node Strem �迭 : ������ ������ �����ϰ� ���Ͽ� ����Ǵ� ��Ʈ��
			FileWriter fw = new FileWriter("C:\\kosta203\\iotest\\test1.txt",true);
			//Processing Stream �迭 : �پ��� ����� ����
			PrintWriter pw = new PrintWriter(fw);
			BufferedWriter bw = new BufferedWriter(pw);
			pw.println("�ȳ� IO");
			pw.close();
			System.out.println("���Ͽ� ���!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
