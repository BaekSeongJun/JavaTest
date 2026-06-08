package com.hymedia.a_basic;

import java.util.Scanner;

public class VariablePractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 : ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("두 번째 정수 : ");
        int num2 = Integer.parseInt(sc.nextLine());
        System.out.printf("더하기 결과 : %d\n", num1 + num2);
        System.out.printf("빼기 결과 : %d\n", num1 - num2);
        System.out.printf("곱하기 결과 : %d\n", num1 * num2);
        System.out.printf("나누기 몫 결과 : %d\n", num1 / num2);
        System.out.printf("나누기 나머지 결과 : %d\n", num1 % num2);
    }
}
