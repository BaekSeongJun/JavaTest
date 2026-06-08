package chapter10.practice;

import java.util.Scanner;

public class Run {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean exit = false;
		while(!exit) {
			System.out.println("1. 멤버 2.exit");
			System.out.print("번호 입력 : ");
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
				case 1:
					memberPractice();
					break;
				case 2:
					exit  = true;
					System.out.println("exit를 입력하셨습니다. 프로그램을 종료합니다.");
					break;
				default:
					System.out.println("잘못된 입력입니다. 다시 입력해주세요!!");
					break;
			}
		}
		if(sc != null){
			sc.close();
		}
		System.out.println("The end");
	}

	public static void memberPractice() {
		Member[] members = new Member[5];
		for(int i = 0; i < 5; i++) {
			members[i] = new Member();
			System.out.print("id 입력 : ");
			members[i].setId(sc.nextLine());
			System.out.print("password 입력 : ");
			members[i].setPassword(sc.nextLine());
			System.out.print("이름 입력 : ");
			members[i].setName(sc.nextLine());
			System.out.print("전화번호 입력 : ");
			members[i].setPhoneNumber(sc.nextLine());
		}
		for(Member member : members) {
			System.out.println(member.toString());
		}
		boolean exit = false;
		System.out.print("전화번호를 바꾸고 싶은 사람의 번호를 입력하세요(1~5) : ");
		int num = Integer.parseInt(sc.nextLine()) - 1;
		while(!exit) {
			System.out.print("현재 비밀번호를 입력해주세요 : ");
			String oldpassword = sc.nextLine();
			System.out.print("새 비밀번호를 입력해주세요 : ");
			members[num].changePassword(oldpassword, sc.nextLine());
			if(oldpassword.equals(members[num].getPassword())) {
				System.out.printf("%s 님의 현재 비밀번호 : %s\n",members[num].getName(), members[num].getPassword());
				exit = true;
			}
		}
	}
}
