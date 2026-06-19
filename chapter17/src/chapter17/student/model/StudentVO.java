package chapter17.student.model;

import java.util.Objects;

public class StudentVO implements Comparable<StudentVO>{
	private String name;
	private int id;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private int rank;

	public StudentVO() {
		this(null, 0, 0, 0, 0);
	}

	public StudentVO(String name, int id, int kor, int eng, int math){
		this.name = name;
		this.id = id;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		calculateAvg();
		this.rank = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public void calculateAvg(){
		total = kor + eng + math;
		avg = Math.round((total / 3.0) * 100.0) / 100.0;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof StudentVO studentVO))
			return false;
		return getId() == studentVO.getId() && Objects.equals(getName(), studentVO.getName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId(),getName());
	}

	@Override
	public String toString() {
		return "[ name='" + name + '\'' +
			", id=" + id +
			", kor=" + kor +
			", eng=" + eng +
			", math=" + math +
			", total=" + total +
			", avg=" + avg +
			", rank=" + rank +
			" ]\n";
	}

	@Override
	public int compareTo(StudentVO o) {
		return o.total - this.total;
	}
}
