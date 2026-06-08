package chapter04.page15;

public class ForPractice {
	public static void main(String[] args) {
		//반복문처리 10 -> 9 -> ... 1
		for(int i = 10; i > 0; i--){
			System.out.printf("%5d \t",i);
		}

		System.out.println();

		for(int i = 10; i > 0; i -= 2){
			System.out.printf("%5d \t",i);
		}

		System.out.println();

		for(int i = 0, j = 0; i < 10; i += 2, j += 3){
			System.out.printf("i = %-2d, j = %-2d, i + j = %d\n", i, j, i + j);
		}

		// for(int i =0; i < 10; i+=2){
		// 	System.out.printf("i = %-3d \t",i);
		// }
		//for문을 while문으로
		int i = 0;
		while(i < 10){
			System.out.printf("i = %-3d \t",i);
			i += 2;
		}

	}
}
