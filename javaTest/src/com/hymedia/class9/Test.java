package com.hymedia.class9;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		//실수 계산법
		//1) 실수 > 정수
		//2) 자바의 jdk(컴파일러==엔진)  사칙연산 정수 = 정수 + 정수
		// 실수 = 정수->실수 + 실수
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		double kor = Double.parseDouble(sc.nextLine());
		System.out.print("영어 : ");
		double eng = Double.parseDouble(sc.nextLine());
		System.out.print("수학 : ");
		double math = Double.parseDouble(sc.nextLine());

		double sum = kor + eng + math;
		double avr = sum / (double)3;
		System.out.printf("kor = %.1f\neng = %.1f\nmath = %.1f\nsum = %d\navr = %d", kor, eng, math, (int)sum,
			(int)avr);
	}
}
