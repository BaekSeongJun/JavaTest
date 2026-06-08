package chapter04.exam03;

import java.util.Scanner;

public class Exam04 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.println("============================================================================");
			System.out.println("1. 1번 문제 2. 2번 문제 3. 3번 문제 4. 4번 문제  5. 5번 문제 6. 6번 문제 7. exit");
			System.out.print("번호 입력 : ");
			int choice = Integer.parseInt(scan.nextLine());
			System.out.println("============================================================================");
			switch (choice) {
				case 1:
					practice01();
					break;
				case 2:
					practice02();
					break;
				case 3:
					practice03();
					break;
				case 4:
					practice04();
					break;
				case 5:
					practice05();
					break;
				case 6:
					practice06();
					break;
				case 7:
					System.out.println("exit을 입력하셨습니다. 프로그램을 종료합니다");
					break;
				default:
					System.out.println("잘못된 입력입니다. 다시 입력해주세요!!!");
					break;
			}
			if (choice == 7) {
				break;
			}
		}
		if (scan != null) {
			scan.close();
		}
		System.out.println("the end");
	}

	public static void practice01() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("1번문제입니다.");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println();

		int num = 0;

		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = Integer.parseInt(scan.nextLine());
			if (num < 1) {
				System.out.println("1 이상의 숫자를 입력하세요.");
				continue;
			}
			break;
		}
		for (int i = num; i > 0; i--){
			System.out.printf("%d\t",i);
		}
		System.out.println();
	}
	public static void practice02() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("2번문제입니다.");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println();

		int num = 0;

		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = Integer.parseInt(scan.nextLine());
			if (num < 1) {
				System.out.println("1 이상의 숫자를 입력하세요.");
				continue;
			}
			break;
		}
		for (int i = num; i > 0; i--){
			System.out.printf("%d\t",i);
		}
		System.out.println();
	}
	public static void practice03() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("3번문제입니다.");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println();

		int num1 = 0;
		int num2 = 0;
		while(true){
			System.out.print("첫 번째 숫자 : ");
			num1 = Integer.parseInt(scan.nextLine());
			System.out.print("두 번째 숫자 : ");
			num2 = Integer.parseInt(scan.nextLine());
			if(num1 < 1 || num2 < 1){
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
			}
			break;
		}
		if(num1 > num2){
			for(int i = num2; i <= num1; i++){
				System.out.printf("%d\t",i);
			}
			System.out.println();
		}else if (num2 > num1){
			for(int i = num1; i <= num2; i++){
				System.out.printf("%d\t",i);
			}
			System.out.println();
		}else{
			System.out.printf("%d\n",num1);
		}
	}
	public static void practice04() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("4번문제입니다.");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println();

		int count = 0;
		while(true){
			System.out.print("정수 입력 : ");
			count = Integer.parseInt(scan.nextLine());
			if(count <= 0){
				System.out.println("1이상의 정수를 입력해주세요");
				continue;
			}
			break;
		}
		for(int i = 0; i < count; i++){
			for(int j = 0; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void practice05() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("5번문제입니다.");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println();

		int count = 0;
		while(true){
			System.out.print("정수 입력 : ");
			count = Integer.parseInt(scan.nextLine());
			if(count <= 0){
				System.out.println("1이상의 정수를 입력해주세요");
				continue;
			}
			break;
		}

		for(int i = 0; i < count; i++){
			for(int j = 0; j < count - i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void practice06() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("6번문제입니다.");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println();

		int count = 0;
		while(true){
			System.out.print("정수 입력 : ");
			count = Integer.parseInt(scan.nextLine());
			if(count <= 0){
				System.out.println("1이상의 정수를 입력해주세요");
				continue;
			}
			break;
		}

		for(int i = 0; i < count; i++){
			for(int j = 0; j < count - i; j++){
				System.out.print(" ");
			}
			for(int k = 0; k <= i * 2; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
