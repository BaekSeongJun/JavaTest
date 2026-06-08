package chapter04.page27;

public class LableBreak {
	public static void main(String[] args) {
		OUT : for(int i = 0; i < 9; i++){
			System.out.printf("**** %d단 ****\n",i + 1);
			for(int j = 0; j < 9; j++){
				System.out.printf("%d * %d = %d\n", i + 1, j + 1, (i + 1) * (j + 1) );
				if (j == 7){
					break OUT;
				}
			}
		}
		System.out.println("반복문 종료");
	}
}
