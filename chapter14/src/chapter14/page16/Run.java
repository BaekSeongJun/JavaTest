package chapter14.page16;

public class Run {
	public static void main(String[] args) {
		//A객체를 생성하고, 구현해서, 자원반납처리기능
		try(A a = new A("홍길동")){
			a.inputName();
			System.out.printf("당신이 입력한 이름 : %s\n",a.getName());
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("The end");
	}
}
