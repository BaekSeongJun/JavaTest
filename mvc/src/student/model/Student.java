package student.model;

import java.util.Objects;

public class Student {
	private String name;
	private String no;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private int rank;

	public Student(){
		this(null, null, 0, 0, 0);
	}
	public Student(String name, String no, int kor, int eng, int math) {
		this.name = name;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = total / 3.0;
		this.rank = 0;
	}

	public Student(Student s){
		this.name = s.name;
		this.no = s.no;
		this.kor = s.kor;
		this.eng = s.eng;
		this.math = s.math;
		this.total = s.total;
		this.avg = s.avg;
		this.rank = s.rank;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(){
		total = kor + eng + math;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(){
		avg = total / 3.0;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Student student))
			return false;
		return Objects.equals(getName(), student.getName()) && Objects.equals(getNo(), student.getNo());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getName(), getNo());
	}

	@Override
	public String toString() {
		return "{" + name + '\'' +
			", " + no + '\'' +
			", " + kor +
			", " + eng +
			", " + math +
			", " + total +
			", " + avg +
			", " + rank +
			'}';
	}
}
