package chapter07.page10;

import java.util.Arrays;

public class A {
	//멤버 변수

	//생성자

	//getter, setter

	//기능
	//1) 리턴값 없고, 함수명 print, 매개변수 없고, 안녕출력
	public void print(){
		System.out.println("안녕");
	}
	//2) 리턴값 int, 함수명 data, 매개변수 없고, 3을 리턴
	public int data(){
		return 3;
	}
	//3) 리턴값 double, 함수명 sum 매개변수 int a , double b, a와 b의 합 리턴
	public double sum(int a, double b){
		return a + b;
	}
	//4) 리턴값 없고, 함수명 printMonth 매개변서 int m, m이 0에서 12사이가 아니면 잘못된 입력! 출력 그 외에는 m + 월 입니다 출력
	public void printMonth(int m){
		if(m <= 0 || m > 12){
			System.out.println("잘못된 입력!");
			return;
		}
		System.out.printf("%d월 입니다.\n",m);
	}
	//출력

	//정적멤버함수(객체를 만들지 않고도 정적멤버함수를 사용이 가능
	public static void staticPrint(){
		System.out.println("정적안녕");
	}

	public static double staticSum(int a, double b){
		return a + b;
	}

	public static void intArrayPrint(int[] array){
		System.out.printf("    %s    \n", Arrays.toString(array));

	}
}
