package com.hymedia.a_basic;

import java.util.Scanner;

public class VariablePractice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 : ");
        double kor = Double.parseDouble(sc.nextLine());
        System.out.print("영어 : ");
        double eng = Double.parseDouble(sc.nextLine());
        System.out.print("수학 : ");
        double math = Double.parseDouble(sc.nextLine());

        int total = (int)kor + (int)eng + (int)math;
        int avg = total/3;

        System.out.printf("총점 : %d\n",total);
        System.out.printf("평균 : %d\n",avg);

    }
}
