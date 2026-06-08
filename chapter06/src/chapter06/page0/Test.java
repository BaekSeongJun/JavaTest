package chapter06.page0;

import java.util.Scanner;

public class Test {
	public static void main(String[] args){
		//3명의 학생의 정보를 입력받는다.(반복문, 배열)
		//학생 이름,국어,영어,수학
		//3명의 학생정보와, 3명의 총점을 출력한다.
		Scanner sc = new Scanner(System.in);

		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		int[] total = new int[3];

		for(int i = 0; i < name.length; i++) {
			System.out.printf("이름%d : ",i);
			name[i] = sc.nextLine();

			System.out.printf("국어%d : ",i);
			kor[i] = Integer.parseInt(sc.nextLine());

			System.out.printf("영어%d : ",i);
			eng[i] = Integer.parseInt(sc.nextLine());

			System.out.printf("수학%d : ",i);
			math[i] = Integer.parseInt(sc.nextLine());

			//총점 구하는것을 함수로 이용해서 처리하겠다.
			total[i] = totalCalculate(kor[i], eng[i], math[i]);
			//total[i] = kor[i] + eng[i] + math[i];
		}

		for(int i = 0; i < name.length; i++) {
			System.out.printf("name = %s kor = %-5d eng = %-5d math = %-5d total = %-5d\n", name[i], kor[i], eng[i], math[i],
				total[i]);
		}

		if(sc != null){
			sc.close();
		}
		System.out.println("The end");
	}

	//3과목의 점수를 총합에서 리턴하는 함수
	private static int totalCalculate(int kor, int eng, int math) {
		int sum = kor + eng + math;
		return sum;
	}
}
