package chapter14.page01;

public class Run3 {
	public static void main(String[] args) {
		//unchecked NullPointerException
		String str = null;
		try {
			System.out.println(str.charAt(2));
		} catch (Exception e) {
			System.out.println("고객님 정신차리세요");
		} finally {
			System.out.println("예외가 발생하든 안하든 무조건 처리합니다.");
		}
			System.out.println("The end");
	}
}
