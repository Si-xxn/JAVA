package ch16.io.read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExam3 {

	public static void main(String[] args) throws Exception {
		// 파일에서 글자를 추출용으로 활용 가능
		
		InputStream inputStream = new FileInputStream("c:\\temp\\text.txt");
		
		int readByteNo;
		byte[] readBytes = new byte[8];
		readByteNo = inputStream.read(readBytes, 2, 3);
		for(int i=0; i<readBytes.length; i++) {
			System.out.println((char)readBytes[i]);
		}
		inputStream.close();

	}

}
