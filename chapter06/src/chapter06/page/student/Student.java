package chapter06.page.student;

//분산되어있는 학생의 정보를 Student클래스로 관리한다.
public class Student {
	//멤버 변수
	String name;
	int kor;
	int eng;
	int math;
	int total;

	//기본생성자(default)
	public Student(){
		new Student(null, 0,0,0);
	}

	//생성자
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	//멤버함수
	public void totalCalculate() {
		total = kor + eng + math;
	}

	//멤버함수
	public void printStudentInfo(){
		System.out.printf("name = %-10s kor = %-5d eng = %-5d math = %-5d total = %-5d\n", name, kor, eng, math, total);
	}
}
