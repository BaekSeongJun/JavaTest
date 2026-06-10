package chapter14.page14;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Run {
	public static void main(String[] args) {
		//finally 이요한 자원반납처리 예외처리
		//키보드, 파일, 네트워크전송 -> 1byte로 입력한 값을 2byte char로 변형을 해서 값을 읽겠다.
		InputStreamReader isr = null;
		char[] buffer = new char[10];
		//System.in => 키보드
		try {
			isr = new  InputStreamReader(System.in);
			System.out.print(" >>> ");
			// char charValue = (char)isr.read();
			int readCount = isr.read(buffer);
			System.out.printf("redad Count = %d  문자열 %s \n",readCount, Arrays.toString(buffer));
			// System.out.printf("키보드로부터 받은 문자 : %c\n",charValue);
		} catch (IOException e) {
			System.out.println("System.in 장치 문제발생");
		} finally {
			if(isr != null){
				try {
					isr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
