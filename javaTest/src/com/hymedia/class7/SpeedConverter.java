package com.hymedia.class7;

import java.util.Scanner;

public class SpeedConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시속(km/h) 입력 :");
        int hourlySpeed =  Integer.parseInt(sc.nextLine());
        sc.close();
        double secondlySpeed = (double)hourlySpeed * 10 / 36;

        System.out.printf("시속 %d km/h는 초속 %.2f m/s 입니다.",hourlySpeed,secondlySpeed);
    }
}
