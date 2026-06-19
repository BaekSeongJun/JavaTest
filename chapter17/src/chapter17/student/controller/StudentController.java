package chapter17.student.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import chapter17.student.model.StudentVO;

public class StudentController {
	private List<StudentVO> list;
	private List<StudentVO> cList;

	public StudentController() {
		list = new ArrayList<>();
	}

	public int addStudent(StudentVO studentVO) {
		try{
			for(StudentVO vo : list){
				if(vo.getId() ==  studentVO.getId()){
					return 0;
				}
			}
			if(studentVO != null){
				list.add(studentVO);
			}else{
				return 0;
			}
			return 1;
		}catch(Exception e){
			return 0;
		}
	}

	public List<StudentVO> printAll(){
		return list;
	}

	public StudentVO searchStudent(String name, int id){
		for(StudentVO svo : list){
			if(svo.getId() == id &&  svo.getName().equals(name)){
				return svo;
			}
		}
		return null;
	}

	public StudentVO deleteStudent(String name,int id){
		for(StudentVO svo : list){
			if(svo.getId() == id &&  svo.getName().equals(name)){
				list.remove(svo);
				return svo;
			}
		}
		return null;
	}

	public StudentVO updateStudent(int id, StudentVO student){
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getId() == id){
				list.set(i, student);
				return list.get(i);
			}
		}
		return null;
	}

	public List<StudentVO> sortByTotalDesc(){
		//얕은 복사
		try {
			cList = new ArrayList<StudentVO>(list);

			Collections.sort(cList);

			for (int i = 0; i < cList.size(); i++) {
				if (i == 0) {
					cList.get(i).setRank(1);
					continue;
				}
				//직전 index와 total점수가 같은지 확인
				if (cList.get(i).getTotal() == cList.get(i - 1).getTotal()) {
					cList.get(i).setRank(cList.get(i - 1).getRank());
				} else {
					cList.get(i).setRank(i + 1);
				}
			}
			return cList;
		}catch(Exception e) {
			return null;
		}
	}

	public List<StudentVO> sortByNameAsc(){
		//얕은 복사
		try {
			cList = new ArrayList<StudentVO>(list);
			Collections.sort(cList, new AscNameStudent());
			return cList;
		}catch(Exception e) {
			return null;
		}
	}



}
