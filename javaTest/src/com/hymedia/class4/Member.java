package com.hymedia.class4;

import java.util.Scanner;

public class Member {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        //String 사용자 이름과 Int 나이와 String성별을 입력받아서 출력하는 프로그램을 작성하시오.
        System.out.print("사용자 이름 : ");
        String name = scan.nextLine();
        System.out.print("나이 : ");
        int age = Integer.parseInt(scan.nextLine());
        System.out.print("성별 (남 또는 여) : ");
        String gender = scan.nextLine();

        //출력하는 프로그램
        System.out.printf("사용자 이름 : %s \n사용자 나이 : %d 세 \n사용자 성별 : %s", name, age, gender);
    }
}
