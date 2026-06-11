package chapter14.page27;

public class Run {
	public static void main(String[] args) {
		//우리가 만든 MyException 사용해서 예외처리를 진행하는 프로그램
		//1.사용자로 부터 정수갑을 인정받는다.
		//2.사용자가 입력한 값이 0~100 정상동작 출력하고,
		//그렇지 않으면 내가 만든 예외처리를 진행한다.
		int no = 110;

		try{

		if(no <0 || no >100){
			//예외가 발생이 되어야한다.
			throw new MyException("0부터 100사이 값만 값을 받습니다.");
		}else{
			System.out.println("정상 동작");
		}
		} catch(MyException e){
			e.printStackTrace();
		}
		System.out.println("The end");
	}
}
