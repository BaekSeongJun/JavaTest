package com.hymedia.class9;

public class TypeCasting {
	public static void main(String[] args) {
		//강제형변환(수동형변환), 자동형변환(값을 잃어버리지 않았을 때)
		int iValue = (int)34.45f;    //수동형변환
		double dValue = (double)34.45f;        //자동형변환
		int sValue = 5 + 4;
		int iValue2 = (int)'a';
		System.out.printf("iValue2 = %d %c\n", iValue2, (char)iValue2);

		//정수 산술연산 정수 => 정수
		System.out.println((double)10 / (double)4);
		//정수형변수 = 정수 + 실수
		int iValue3 = (int)(10 + 5.4);
		System.out.printf("iValue3 = %d\n", iValue3);

		//정수형변수 = short변수 + byte변수
		short sValue2 = 100;
		byte bValue2 = 100;
		int iValue4 = sValue2 + bValue2;

	}
}
