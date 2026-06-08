package com.hymedia.a_basic;

import java.util.Scanner;

public class VariablePractice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("가로 : ");
        double width = Double.parseDouble(sc.nextLine());
        System.out.print("세로 : ");
        double height = Double.parseDouble(sc.nextLine());
        double area = width * height;
        double preimeter = (width + height) * 2;
        System.out.printf("면적 : %.2f\n", area);
        System.out.printf("둘레 : %.1f\n", preimeter);
    }
}
