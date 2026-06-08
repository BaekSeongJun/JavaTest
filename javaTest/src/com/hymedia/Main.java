package com.hymedia;

//import
import java.util.Scanner;

//신호등 프로그램
public class Main {
	
	//실행하는 함수(기능)
	public static void main(String[] args) {
		//변수명
		//입력객체 System.in
		Scanner sc = new Scanner(System.in);
		String name;
		String trafficLight;
		int age;
		
		//입력기능 
		System.out.print("당신의 이름을 입력요청 >> ");
		name = sc.nextLine();
		
		System.out.print("당신의 나이를 입력요청 >> ");
		age = sc.nextInt();
		//입력버퍼에 있는 값을 모두 지우는 기능
		sc.nextLine();
		
		System.out.print("현재 신호등의 상태를 입력요청(빨간불 or 파란불) >> ");
		trafficLight = sc.nextLine();
		
		sc.close();
		
		//출력객체 :  System.out 화면에 출력하는 문장 (sysout -> ^+sb)
		System.out.printf("%d살인 %s님이 신호등 앞에서 대기한다.\n",age,name);
		System.out.println("신호등을 확인한다. 현재는 " +trafficLight);	
		System.out.println("빨간불인지, 파란불인지 점검한다.");
		if(trafficLight.equals("빨간불")) {
			System.out.println("빨간불이면 대기한다.");
		}else {
			System.out.println("파란불이면 지나간다.");
			System.out.println("교차로를 건너서 도착한다.");
		}
		System.out.println("The end");
	}
}
