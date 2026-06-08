package com.hymedia.a_basic;

import java.util.Scanner;

public class VariablePractice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String message = sc.nextLine();
        sc.close();

       System.out.printf("첫 번째 문자 : %c\n",message.charAt(0));
       System.out.printf("두 번째 문자 : %c\n",message.charAt(1));
       System.out.printf("세 번째 문자 : %c\n",message.charAt(2));
    }
}
