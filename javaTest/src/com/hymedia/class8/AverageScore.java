package com.hymedia.class8;

import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("영어 점수 입력 : ");
        int englishScore = Integer.parseInt(sc.nextLine());
        System.out.print("과학 점수 입력 : ");
        int scienceScore = Integer.parseInt(sc.nextLine());
        sc.close();

        int avg =  (englishScore + scienceScore) / 2;
        System.out.printf("영어 : %d 점, 과학 : %d 점, 평균 : % d 점", englishScore, scienceScore, avg);

    }
}
