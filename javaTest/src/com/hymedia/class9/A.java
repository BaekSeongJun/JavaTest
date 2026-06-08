package com.hymedia.class9;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {

		//상수
		final double PI = 3.141592;

		//byte 변수 값을 저장해보자 ( -128 ~ 127 )
		byte byteValue = 127;

		System.out.printf("byteValue = %d \n", (byte)(byteValue + 1));

		//문자열을 받아서 한개씩 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String name = sc.nextLine();
		System.out.printf("당신이 입력한 문자열 : %s\n", name);
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}
		//정수 100값을 10진수, 8진수, 16진수, 2진수 변환해서 보여줘
		System.out.print("정수값 : ");
		int number = Integer.parseInt(sc.nextLine());

		System.out.printf("10진법 : %d\n 8진법 : %o\n16진법 : %x\n 2진법: %s", number, number, number,
			Integer.toBinaryString(number));
		if (sc != null) {
			sc.close();
		}
		System.out.println("\nend");

	}
}
