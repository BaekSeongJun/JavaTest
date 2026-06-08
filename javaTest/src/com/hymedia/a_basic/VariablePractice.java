package com.hymedia.a_basic;

import java.util.Scanner;

public class VariablePractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력 하세요 : ");
        String name = sc.nextLine();
        System.out.print("성별을 입력 하세요 (남/여): ");
        String gender = sc.nextLine();
        System.out.print("나이를 입력 하세요 : ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("키를 입력하세요 (cm) :");
        double height = Double.parseDouble(sc.nextLine());
        System.out.printf("키 %.1fcm인 %d살 %s자 %s님 반갑습니다^^", height, age, gender, name);
    }
}
