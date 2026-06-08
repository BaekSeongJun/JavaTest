package com.hymedia.class4_2;

import java.util.Scanner;

public class Member {
    public static void main(String[] args) {
        //학생의 이름과 학번과 국어점수와 수학점수와 영어점수를 받아서 출력하시오
        Scanner sc = new Scanner(System.in);
        System.out.print("학생의 이름 : ");
        String name = sc.nextLine();
        System.out.print("학번 : ");
        int studentNum =  Integer.parseInt(sc.nextLine());
        System.out.print("국어 점수 : ");
        int kor =  Integer.parseInt(sc.nextLine());
        System.out.print("수학 점수 : ");
        int math =  Integer.parseInt(sc.nextLine());
        System.out.print("영어 점수 : ");
        int eng =  Integer.parseInt(sc.nextLine());
        sc.close();

        int sum = kor + math + eng;

        System.out.printf("학생 이름 : %s\n학번 : %d\n국어 점수 : %d 점\n수학 점수 : %d 점\n영어 점수 : %d 점\n총 점 : %s 점",name,studentNum,kor,math,eng,sum);
    }
}
