package chapter10;

public class Run {
	public static void main(String[] args) {
		//자식객체를 생성
		Student student = new Student("bsj",28,1100);
		//자식멤버변수출력
		System.out.printf("stu.name = %s\n",student.getName());
		System.out.printf("stu.age = %d\n",student.getAge());
		System.out.printf("stu.studentID = %d\n",student.getStudentID());
		student.goToSchool();
		student.eat();
		student.sleep();
	}
}
