package chapter07.page02;

public class Member {
	//멤버변수
	private int id;
	private String name;
	private int age;

	//디폴트 생성자
	public Member(){
		this(1,null,0);
	}

	//생성자
	public Member(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	//getter
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	//setter
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}

	//나이 판독
	public boolean isAdult(){
		if(age < 20){
			return false;
		}
		return true;
	}

	//출력
	@Override
	public String toString() {
		return "Member{" +
			"id : " + id +
			", 이름 : '" + name + '\'' +
			", 나이 : " + age +
			'}';
	}
}
