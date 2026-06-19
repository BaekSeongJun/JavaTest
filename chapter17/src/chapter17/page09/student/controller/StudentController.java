package chapter17.page09.student.controller;

import java.util.ArrayList;
import java.util.List;

import chapter17.page09.student.model.Student;

public class StudentController {
	private List<Student> sArr;
	private List<Student> csArr;

	public StudentController() {
		sArr = new ArrayList<Student>();
		csArr = new ArrayList<Student>();
	}

	public void insertStudent(){
		sArr.add(new Student("kdj1", "20260601",100,100,100));
		sArr.add(new Student("kdj2", "20260602",90,100,100));
		sArr.add(new Student("kdj3", "20260603",80,100,100));
		sArr.add(new Student("kdj4", "20260604",70,100,100));
		sArr.add(new Student("kdj5", "20260605",60,100,100));
	}

	public List<Student> selectStudent(){
		return sArr;
	}

	public Student searchStudentNoName(String name, String no){
		Student findStudent = null;
		for(Student s : sArr){
			if(s.getName().equals(name) && s.getNo().equals(no)) {
				findStudent = s;
				break;
			}
		}
		return findStudent;
	}

	public List<Student> sortStudent(){
		for(Student s : sArr){
			csArr.add(new Student(s));
		}
		for(int i = 0; i< csArr.size() - 1; i++) {
			for (int j = 0; j < csArr.size() -i -1; j++) {
				if (csArr.get(j).getTotal() < csArr.get(j+1).getTotal()) {
					Student buffer = csArr.get(j);
					csArr.set(j , csArr.get(j+1));
					csArr.set(j+1, buffer);
				}
			}
		}
		return csArr;
	}

	public int sumTotal(){
		int sum = 0;
		for(Student s : sArr){
			if(s != null){
				sum += s.getTotal();
			}
		}
		return sum;
	}

	public double avgTotal(){
		return (double)sumTotal() /sArr.size();
	}

	public List<Student> rankStudent(){
		for(int i = 0; i < csArr.size(); i++){
			if(i != 0 && csArr.get(i-1).getTotal() == csArr.get(i).getTotal()){
				csArr.get(i).setRank(csArr.get(i-1).getRank());
			}else{
				csArr.get(i).setRank(i+1);
			}
		}

		for (int i = 0; i < csArr.size(); i++){
			for(int j = 0; j < sArr.size(); j++){
				if(csArr.get(i).getNo().equals(sArr.get(j).getNo())){
					sArr.get(j).setRank(csArr.get(i).getRank());
					break;
				}
			}
		}
		return csArr;
	}
}
