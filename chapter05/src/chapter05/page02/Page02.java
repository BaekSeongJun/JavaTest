package chapter05.page02;

public class Page02 {
	public static void main(String[] args) {
		//배열선언 정수형[], 실수형[], 문자형[],부울형[], 문자열[]
		//주의: 자바는 반드시 배열의 크기를 결정해야한다. (이유: 저장장소를 무한히 쓸 수 없기때문)
		//자바스크립트 let a= [10, 23.4, "abcd", false] , let a = new Array(4)
		// let a =new Array(10, 23.4, "abcd", false);
		String[] strArray = new String[4];
		double[] doubleArray = new double[4];
		char[] charArray = new char[4];
		boolean[] booleanArray = new boolean[4];
		int[] intArray = new int[4]; // let a = new Array(4)
		intArray[0] = 10;
		intArray[1] = 20;
		intArray[2] = 30;
		intArray[3] = 40;
		int[] intArray2 = new int[] {19,20,30,40};
		// let a= [10, 23.4, "abcd", false] or new Array(10, 23.4, "abcd", false)
		System.out.printf("%3d \t",intArray2[0]);
		System.out.printf("%3d \t",intArray2[1]);
		System.out.printf("%3d \t",intArray2[2]);
		System.out.printf("%3d \t",intArray2[3]);


		System.out.println("\n===========================================");
		for (int i = 0; i < intArray2.length; i++) {
			System.out.printf("%3d \t",intArray2[i]);
		}


	}
}
