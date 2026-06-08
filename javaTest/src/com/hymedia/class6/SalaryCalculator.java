package com.hymedia.class6;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("월급 입력:");
        int monthlySalary = Integer.parseInt(sc.nextLine());
        System.out.print("상여금 입력:");
        int bonus = Integer.parseInt(sc.nextLine());
        sc.close();

        int annualSalary = monthlySalary * 12 + bonus;

        System.out.printf("월급 : %d만원, 상여금: %d만원, 연봉 : %d만원",monthlySalary, bonus, annualSalary);
    }
}
