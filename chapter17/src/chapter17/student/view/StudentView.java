package chapter17.student.view;

import java.util.List;
import java.util.Scanner;

import chapter17.student.controller.StudentController;
import chapter17.student.model.StudentVO;

public class StudentView {
	private Scanner scan;
	private StudentController sc;

	public StudentView(){
		scan = new Scanner(System.in);
		sc = new StudentController();
	}

	public void mainMenu(){
		boolean exitFlag = false;

		while (!exitFlag) {
			System.out.println("***** 학생 성적 관리 메뉴 *****");
			System.out.println("1. 학생 정보 추가");
			System.out.println("2. 전체 학생 목록 출력");
			System.out.println("3. 특정 학생 검색");
			System.out.println("4. 특정 학생 삭제");
			System.out.println("5. 특정 학생 정보 수정");
			System.out.println("6. 총점 내림차순 정렬 및 석차 부여");
			System.out.println("7. 이름 오름차순 정렬");
			System.out.println("8. Test용 더미 자료 입력");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 번호 선택 : >> ");

			int no = Integer.parseInt(scan.nextLine());

			switch (no) {
				case 0:	exitFlag = true; break;
				case 1:	addStudent(); break;
				case 2:	printAll(); break;
				case 3:	searchStudent(); break;
				case 4:	removeStudent(); break;
				case 5:	updateStudent(); break;
				case 6:	sortByTotalDesc(); break;
				case 7:	sortByNameAsc(); break;
				case 8:	addDummy(); break;
				default: System.out.println("잘못된 번호 입력"); break;
			}
		}

		if(scan != null) scan.close();
		System.out.println("***** 프로그램종료 *****");
	}
	private void addStudent(){
		System.out.println("=====***** 학생 추가 *****=====");
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("번호 : ");
		int id = Integer.parseInt(scan.nextLine());
		System.out.print("국어 점수 : ");
		int kor = Integer.parseInt(scan.nextLine());
		System.out.print("영어 점수 : ");
		int eng = Integer.parseInt(scan.nextLine());
		System.out.print("수학 점수 : ");
		int math = Integer.parseInt(scan.nextLine());
		int num = sc.addStudent(new StudentVO(name, id, kor, eng,math ));
		if(num == 0){
			System.out.println("추가 실패");
		}else{
			System.out.println("추가 성공");
		}
	}

	private void printAll(){
		System.out.println("=====***** 학생 정보 *****=====");
		List<StudentVO> list = sc.printAll();
		if(list != null){
			System.out.println(list);
		}else{
			System.out.println("출력할 학생 목록이 잆습니다.");
		}
	}

	private void searchStudent(){
		System.out.println("=====***** 학생 정보 검색 *****=====");
		System.out.print("검색할 이름 : ");
		String name = scan.nextLine();
		System.out.print("번호 : ");
		int id = Integer.parseInt(scan.nextLine());
		StudentVO student = sc.searchStudent(name,id);
		if(student != null){
			System.out.println(student);
		}else{
			System.out.println("존재 하지 않는 학생입니다");
		}
	}

	private void removeStudent(){
		System.out.println("=====***** 학생 정보 삭제 *****=====");
		System.out.print("삭제할 이름 : ");
		String name = scan.nextLine();
		System.out.print("번호 : ");
		int id = Integer.parseInt(scan.nextLine());
		StudentVO student = sc.deleteStudent(name,id);
		if(student != null){
			System.out.println("삭제성공 : " + student);
		}else{
			System.out.println("존재 하지 않는 학생이거나 삭제에 실패했습니다.");
		}
	}

	private void updateStudent(){
		System.out.println("=====***** 학생 정보 수정 *****=====");
		System.out.print("수정할 학생의 번호 : ");
		int id = Integer.parseInt(scan.nextLine());
		System.out.print("수정 후 이름 : ");
		String name = scan.nextLine();
		System.out.print("수정할 국어 점수 : ");
		int kor = Integer.parseInt(scan.nextLine());
		System.out.print("수정할 영어 점수 : ");
		int eng = Integer.parseInt(scan.nextLine());
		System.out.print("수정할 수학 점수 : ");
		int math = Integer.parseInt(scan.nextLine());

		StudentVO studentVO = new StudentVO(name,id,kor,eng,math);
		StudentVO student = sc.updateStudent(id,studentVO);
		if(student != null){
			System.out.println("수정 성공 : " + student);
		}else{
			System.out.println("수정 실패");
			System.out.println("=====*****신규 학생 등록 시도*****=====");
			int num = sc.addStudent(studentVO);
			if(num == 0){
				System.out.println("추가 실패");
			}else{
				System.out.println("추가 성공");
			}
		}
	}

	private void sortByTotalDesc(){
		List<StudentVO> list = sc.sortByTotalDesc();
		for(StudentVO student : list){
			System.out.printf("%d등 [ 이름 : %s, 번호 : %d ]\n",student.getRank(),student.getName(),student.getId());
		}
	}

	private void sortByNameAsc(){
		List<StudentVO> list = sc.sortByNameAsc();
		for(StudentVO student : list){
			System.out.println(student);
		}
	}

	private void addDummy() {
		sc.addStudent(new StudentVO("김윈터", 260601, 90, 19, 90));
		sc.addStudent(new StudentVO("카리나", 260602, 90, 80, 37));
		sc.addStudent(new StudentVO("백성준", 260603, 81, 54, 72));
		sc.addStudent(new StudentVO("아무개", 260604, 77, 67, 74));
		sc.addStudent(new StudentVO("홍길동", 260605, 50, 90, 93));
	}
}
