package chapter14.page10;

public class Run {
	public static void main(String[] args) {
		//다중예외처리하기
		try{
			System.out.println(3/0);
			int num = Integer.parseInt("10!");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArithmeticException");
		}catch (NullPointerException e){
			System.out.println("NumberFormatException");
		}catch (Exception e){
			System.out.println("Exception");
			e.printStackTrace();
		}finally {
			System.out.println("The end");
		}
	}
}
