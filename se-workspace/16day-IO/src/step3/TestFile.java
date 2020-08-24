package step3;

import java.io.File;

public class TestFile {

	public static void main(String[] args) {
		// separator ==> \
		// java.io.File class : ������ �����ϴ� ����� ����
		String path = "C:" + File.separator + "kosta203";
		File dir = new File(path);
		System.out.println(dir.exists()); // ���� �˻�
		System.out.println(dir.isFile()); // ���� ���� �˻�
		System.out.println(dir.isDirectory());// ����(���丮) ���� �˻�
		System.out.println(dir.getPath());
		String path2 = dir.getPath() + File.separator + "iotest2";
		File dir2 = new File(path2);
		System.out.println(dir2.mkdirs());
		// ���� ���丮�� �̵��ؼ� ���ϰ�ü��ȯ
		File dir3 = dir2.getParentFile();
		System.out.println(dir3.getPath());
		// kosta203 ���丮�� �ִ� ���� �� ���͸� ������ ��� ����
		String arr[] = dir3.list();
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		File arr2[] = dir3.listFiles();
		for(int i=0; i<arr2.length;i++) {
			if(arr2[i].isFile()) {
				System.out.println(arr2[i].getName() + " �����Դϴ�.");
			}else if(arr2[i].isDirectory()) {
				System.out.println(arr2[i] +" ���丮�Դϴ�.");
			}
		}

	}

}
