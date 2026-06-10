package chapter14.page14;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Run2 {
	public static void main(String[] args) {
		try (InputStreamReader isr = new InputStreamReader(System.in);){
			System.out.print(" >>> ");
			char charValue = (char)isr.read();
			System.out.printf("키보드로부터 받은 문자 :  %c\n", charValue);
		}catch(IOException e){
			e.printStackTrace();
		}
		// InputStreamReader isr = null;
		// try {
		// 	isr = new  InputStreamReader(System.in);
		// 	System.out.print(" >>> ");
		// 	int readCount = isr.read(buffer);
		// 	System.out.printf("redad Count = %d  문자열 %s \n",readCount, Arrays.toString(buffer));
		// } catch (IOException e) {
		// 	System.out.println("System.in 장치 문제발생");
		// } finally {
		// 	if(isr != null){
		// 		try {
		// 			isr.close();
		// 		} catch (IOException e) {
		// 			e.printStackTrace();
		// 		}
		// 	}
		// }
	}
}
