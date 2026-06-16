package student.controller;

import student.model.Student;

public class StudentController {
	private Student[] sArr;
	private Student[] csArr;
	private static final int COUNT = 5;

	public StudentController() {
		sArr = new Student[COUNT];
		csArr = new Student[COUNT];
	}

	public void insertStudent(){
		sArr[0] = new Student("kdj1", "20260601",100,100,100);
		sArr[1] = new Student("kdj2", "20260602",90,100,100);
		sArr[2] = new Student("kdj3", "20260603",80,100,100);
		sArr[3] = new Student("kdj4", "20260604",70,100,100);
		sArr[4] = new Student("kdj5", "20260605",60,100,100);
	}

	public Student[] selectStudent(){
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

	public Student[] sortStudent(){
		for(int i = 0; i < COUNT; i++){
			if(sArr[i] != null){
				csArr[i] = new Student(sArr[i]);
			}
		}
		for(int i = 0; i< COUNT-1; i++) {
			for (int j = 0; j < COUNT -i -1; j++) {
				if (csArr[j].getTotal() < csArr[j+1].getTotal()) {
					Student buffer = csArr[j];
					csArr[j] = csArr[j+1];
					csArr[j+1] = buffer;
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
		return (double)sumTotal() /COUNT;
	}

	public Student[] rankStudent(){
		for(int i = 0; i < COUNT; i++){
			if(i != 0 && csArr[i-1].getTotal() == csArr[i].getTotal()){
				csArr[i].setRank(csArr[i-1].getRank());
			}else{
				csArr[i].setRank(i+1);
			}
		}

		for (int i = 0; i < csArr.length; i++){
			for(int j = 0; j < sArr.length; j++){
				if(csArr[i].getNo().equals(sArr[j].getNo())){
					sArr[j].setRank(csArr[i].getRank());
					break;
				}
			}
		}
		return csArr;
	}
}
