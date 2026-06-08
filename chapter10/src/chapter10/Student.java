package chapter10;

public class Student extends Human{
	//멤변[부모 (이름, 나이), 학번]
	private int studentID;

	//생성자(디생, 매생) :
	//자식 부모생성자를 책임 져야한다.
	public Student(){
		this(null,0,0);
	}
	public Student(String name, int age, int studentID){
		super(name,age);
		this.studentID = studentID;
	}
	//멤함(등교하기)
	public int getStudentID(){
		return studentID;
	}
	public void goToSchool(){
		System.out.printf("등교하기 ID : %d, name = %s, age = %d\n",studentID, super.getName(), super.getAge());
	}
}
