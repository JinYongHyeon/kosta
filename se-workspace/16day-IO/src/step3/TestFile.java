package step3;

import java.io.File;

public class TestFile {

	public static void main(String[] args) {
		// separator ==> \
		// java.io.File class : 파일을 제공하는 기능을 제공
		String path = "C:" + File.separator + "kosta203";
		File dir = new File(path);
		System.out.println(dir.exists()); // 유무 검사
		System.out.println(dir.isFile()); // 파일 유무 검사
		System.out.println(dir.isDirectory());// 폴더(디렉토리) 유무 검사
		System.out.println(dir.getPath());
		String path2 = dir.getPath() + File.separator + "iotest2";
		File dir2 = new File(path2);
		System.out.println(dir2.mkdirs());
		// 상위 디렉토리로 이동해서 파일객체반환
		File dir3 = dir2.getParentFile();
		System.out.println(dir3.getPath());
		// kosta203 디렉토리에 있는 파일 및 디렉터리 정보를 모두 나열
		String arr[] = dir3.list();
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		File arr2[] = dir3.listFiles();
		for(int i=0; i<arr2.length;i++) {
			if(arr2[i].isFile()) {
				System.out.println(arr2[i].getName() + " 파일입니다.");
			}else if(arr2[i].isDirectory()) {
				System.out.println(arr2[i] +" 디렉토리입니다.");
			}
		}

	}

}
