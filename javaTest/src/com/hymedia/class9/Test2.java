package com.hymedia.class9;

public class Test2 {
	public static void main(String[] args) {
		//실수범위체크(float); 소숫점 자리수 대략 7자리까지 기억한다.
		float floatValue = 1.00000181111f;
		System.out.printf("floatValue = %f\n", floatValue);

		//실수범위체크(double); 소숫점 자리수 대략 15자리까지 기억한다.
		double doubleValue = 1.000000000000001771111;
		System.out.println(doubleValue);

		//부울값을 출력
		boolean boolValue = true;
		System.out.printf("boolValue = %b\n", boolValue);

		//문자를 저장하면 메모리에는 그 문자의 해당되는 유니코드값(정수값) 저장된다.
		char charValue = 0xac00;
		System.out.printf("charValue = %04x\n", (int)charValue);
		System.out.printf("charValue = %04d\n", (int)charValue);
		System.out.printf("charValue = %c\n", charValue);

	}
}
