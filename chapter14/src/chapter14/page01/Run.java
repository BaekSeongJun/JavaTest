package chapter14.page01;

import java.util.Scanner;

public class Run {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		double value = 0.0;
		int num = 0;
		boolean flag = false;
		while(!flag) {
			System.out.print("숫자 입력(0이 아닌!!!) : ");
			try {
				//실행될 100문장
				System.out.println("100문장이 샐행됨");
				//예외가 발생된 문장..
				num = Integer.parseInt(scan.nextLine());
				value = 10 / num;
				flag = true;
				System.out.println("200문장이 실행됨.");
				//실행할 문장 200문장.
			} catch (Exception e) {
				System.out.println("고객님이 입력하신 값으로는 계산이 불가능합니다. 프로그램을 종료합니다.");
				System.out.println(e.getMessage());
			}
		}
		System.out.printf("결과값 : %5.2f\n", value);
		if(scan != null){
			scan.close();
		}
		System.out.println("The end");
	}
}
