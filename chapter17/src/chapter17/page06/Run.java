package chapter17.page06;

import java.util.ArrayList;
import java.util.Arrays;

public class Run {
	public static void main(String[] args) {
		//배열(크기변경, 삭제변경, 추가변경 : 읽고, 수정만 가능)과 리스트(모두됨)의 차이점 비교
		//배열 크기의 낭비,리스트 낭비 없음 비교
		String[] array = {"가", "나", "다", "라", "마", "바", "사"};
		for(String s : array) {
			System.out.printf("%-5s",s);
		}
		array[1] = null;
		array[2] = null;
		System.out.println();
		for(String s : array) {
			System.out.printf("%-5s",s);
		}

		System.out.printf("\n배열의 크기 : %d\n", array.length);
		System.out.println("array = " + array);
		System.out.println("array = " + Arrays.toString(array) + "kdj");
		System.out.println();
		System.out.println("==========================================================");

		//리스트
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student());
		arrayList.add(new Student());
		arrayList.add(new Student());
		arrayList.add(new Student());
		arrayList.add(new Student());
		arrayList.add(new Student());
		arrayList.add(new Student());
		for(Student s : arrayList) {
			System.out.printf("%-5s\n",s);
		}
		System.out.printf("\n배열의 크기 : %d\n", arrayList.size());
		arrayList.remove(2);
		arrayList.remove(3);
		System.out.println();
		for(Student s : arrayList) {
			System.out.printf("%-5s\n",s);
		}
		System.out.printf("\n배열의 크기 : %d\n", arrayList.size());
		System.out.println(arrayList + "kdj");
	}
}
