package chapter17.page09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Run {
	public static void main(String[] args) {
		//List -> ArrayList Vector LinkedList
		//size() = 10개확보 => 생성자에 갯수를 입력이 가능하다.
		//LinkedList : LinkedList 구조는 사이즈를 잡아두고 사용하는것이 아니기때문에 갯수를 줄 수 없다.
		List<String> aList1 = new ArrayList<String>(50);
		List<String> aList2 = new Vector<String>(50);
		List<String> aList3 = new LinkedList<String>();

		//=================================================================================
		//Arrays.asList(); 정적리스트로 변경한다.(추가, 삭제는 불가능해진다.)
		List<String> alist4 = Arrays.asList("a", "b", "c");
		System.out.println(alist4);
		alist4.set(1,"k");
		System.out.println(alist4);

		//=================================================================================
		//전체삭제
		List<String> alist5 = new ArrayList<String>();
		alist5.add("a");
		alist5.add("b");
		alist5.add("c");
		System.out.println("alist5 = " + alist5);
		alist5.clear();
		System.out.println("alist5 = " + alist5);

		//isEmpty
		if(alist5.isEmpty()){
			System.out.printf("aList5 자료가 없습니다. %d\n", alist5.size());
		}

		//List구조를 배열 구조로 변경
		List<String> alist6 = new ArrayList<String>();
		alist6.add("a");
		alist6.add("b");
		alist6.add("c");
		String[] oArray = alist6.toArray(new String[5]);
		System.out.println(Arrays.toString(oArray));

	}
}
