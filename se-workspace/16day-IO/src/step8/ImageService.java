package step8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageService {
	/**
	 * �̹��� ó���� ���� byte(8bit) ��Ʈ���� �̿��Ѵ�. �Է½�Ʈ�� : ��彺Ʈ�� - FileInputStream, ���μ�����Ʈ�� -
	 * BufferInputStrema ��½�Ʈ�� : ��彺Ʈ�� - FileOutputStream, ���μ�����Ʈ�� -
	 * BufferOutputStream 2����Ʈ�� �ϸ� �̹����� ���� - hdfy���� ��Ȯ�ϰ� �������� �ʾƼ�
	 * 
	 * @param copyPath
	 * @param pastePath
	 * @throws IOException
	 */
	public void copyAndPasteImage(String copyPath, String pastePath) throws IOException {

		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream(copyPath));
			bos = new BufferedOutputStream(new FileOutputStream(pastePath));
			
			int data=0;
			while((data=bis.read())!=-1){
				bos.write(data);
			}
		}finally {
			if(bis!=null)
			bis.close();
			if(bos!=null)
			bos.close();
		}
	}

}
