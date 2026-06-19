package chapter17.page09.student.view;

import static chapter17.page09.student.run.Run.*;
import java.util.List;

import chapter17.page09.student.controller.StudentController;
import chapter17.page09.student.model.Student;

public class StudentMenu {
	private StudentController sc;

	public StudentMenu(){
		sc = new StudentController();
	}

	public void studentInfoDisplay(){
		boolean flag = false;
		while(!flag) {
			System.out.println("==========학생 메뉴입니다.==========");
			System.out.println("1.입력 2.출력 3.정렬 4.점수 총합 5.점수평균 6.검색 7.석차 8. Home");
			System.out.print("메뉴 선택 : ");
			int num = Integer.parseInt(scan.nextLine());
			switch (num) {
				case 1:
					insertStudnet();
					break;
				case 2:
					selectStudnet();
					break;
				case 3:
					sortStudent();
					break;
				case 4:
					sumTotal();
					break;
				case 5:
					avgTotal();
					break;
				case 6:
					searchStudentNoName();
					break;
				case 7:
					rankStudent();
					break;
				case 8:
					System.out.println("홈으로 돌아갑니다.");
					flag = true;
					break;
				default:
					System.out.println("잘못된 입력입니다. 다시 입력해주세요");
					break;
			}
		}
	}

	private void insertStudnet(){
		sc.insertStudent();
	}

	private void selectStudnet(){
		List<Student> sArr =  sc.selectStudent();
		for(Student s: sArr){
			System.out.println(s.toString());
		}
	}

	private void sortStudent(){
		List<Student> sArr =  sc.sortStudent();
		for(Student s: sArr){
			System.out.println(s.toString());
		}
	}

	private void sumTotal(){
		System.out.printf("점수 총합 : %d\n", sc.sumTotal());
	}

	private void avgTotal(){
		System.out.printf("점수 총합 : %5.2f\n", sc.avgTotal());
	}

	private void searchStudentNoName(){
		System.out.print("학생 이름 : ");
		String name = scan.nextLine();
		System.out.print("학번 : ");
		String no = scan.nextLine();
		Student findStudent = sc.searchStudentNoName(name,no);
		if(findStudent != null){
			System.out.println(findStudent.toString());
		}else{
			System.out.println("존재하지 않는 학생입니다.");
		}
	}

	private void rankStudent(){
		List<Student> sArr = sc.rankStudent();
		for (Student student : sArr) {
			System.out.printf("%d 등 학번 : %s, 이름 : %s\n", student.getRank(), student.getNo(), student.getName());
		}
	}
}
