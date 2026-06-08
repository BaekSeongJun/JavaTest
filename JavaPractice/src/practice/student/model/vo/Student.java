package practice.student.model.vo;

import java.util.Objects;

public class Student {
	private String name;
	private String subject;
	private int score;

	public Student(){
		this(null, null, 0);
	}

	public Student(String name, String subject, int score){
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Student student)){
			System.out.println("정신차려 비교대상 오류");
			return false;
		}
		return Objects.equals(getName(), student.getName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	public String inform() {
		return "이름 : " + name + " / 과목 : " + subject + " / 점수 : " + score;
	}
}
