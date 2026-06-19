package chapter17.student.controller;

import java.util.Comparator;

import chapter17.student.model.StudentVO;

public class AscNameStudent implements Comparator<Object> {
	//StudentVO : name 이름 비교해서 정렬
	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof StudentVO s1 && o2 instanceof StudentVO s2){
			return s1.getName().compareTo(s2.getName());
		}
		return 0;
	}

}
