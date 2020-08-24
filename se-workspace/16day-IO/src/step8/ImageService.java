package step8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageService {
	/**
	 * 이미지 처리를 위해 byte(8bit) 스트림을 이용한다. 입력스트림 : 노드스트림 - FileInputStream, 프로세스스트림 -
	 * BufferInputStrema 출력스트림 : 노드스트림 - FileOutputStream, 프로세스스트림 -
	 * BufferOutputStream 2바이트로 하면 이미지가 꺠짐 - hdfy값이 정확하게 떨어지지 않아서
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
