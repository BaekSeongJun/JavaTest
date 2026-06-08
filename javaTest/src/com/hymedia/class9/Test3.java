package com.hymedia.class9;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		sc.close();
		System.out.printf("%c unicode : %d", ch, (int)ch);
	}
}
