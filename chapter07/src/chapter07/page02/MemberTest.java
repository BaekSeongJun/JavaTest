package chapter07.page02;

public class MemberTest {
	public static void main(String[] args) {
		Member member = new Member();

		System.out.println(member);

		member.setId(29);
		member.setName("백성준");
		member.setAge(30);

		if(member.isAdult()){
			System.out.println("성인입니다.");
		}else{
			System.out.println("성인이 아닙니다");
		}
		System.out.printf("ID : %d  이름 : %s  나이 : %d\n",member.getId(),member.getName(),member.getAge());
		System.out.println(member);

		member.setAge(10);
		if(member.isAdult()){
			System.out.println("성인입니다.");
		}else{
			System.out.println("성인이 아닙니다");
		}

		System.out.println(member);
	}
}
