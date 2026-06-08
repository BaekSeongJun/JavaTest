package practice.student.view;

import practice.student.controller.StudentController;
import practice.student.model.vo.Student;

public class StudentMenu {
	private StudentController ssm = new StudentController();

	public StudentMenu(){
		System.out.println("======== 학생 정보 출력 ========");
		Student[] studnets = ssm.printStudent();
		for(Student student : studnets){
			System.out.println(student.inform());
		}
		System.out.println("======== 학생 성적 출력 ========");
		double[] score = ssm.avgScore();
		System.out.printf("학생 점수 합계 : %d\n학생 점수 평균 : %.1f\n", (int)score[0],score[1]);
		System.out.println("======== 성적 결과 출력 ========");
		for(Student student : studnets){
			if(student.getScore() < StudentController.CUT_LINE){
				System.out.printf("%s학생은 재시험 대상입니다.\n", student.getName());
			}else{
				System.out.printf("%s학생은 통과입니다.\n", student.getName());
			}
		}
	}
}
