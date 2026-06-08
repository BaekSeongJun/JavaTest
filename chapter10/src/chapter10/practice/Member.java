package chapter10.practice;

public class Member {
	private String id;
	private String password;
	private String name;
	private String phoneNumber;

	public Member(){
		this(null,null,null,null);
	}

	public Member(String id, String password, String name, String phoneNumber) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void changePassword(String oldPassword, String newPassword) {
		if(password.equals(oldPassword)) {
			if(newPassword.equals(oldPassword)) {
				System.out.println("같은 비밀번호로는 변경하실 수 없습니다!!");
				return;
			}
			this.password = newPassword;
			System.out.printf("[ %s ]님 비밀번호가 정상적으로 변경되었습니다!!",name);
			return;
		}
		System.out.println("비밀번호가 일치하지 않습니다!!!");
	}

	public void displayInfo() {
		System.out.printf("[ %s ] 님의 정보 >> 이름 : %s , 전화번호 : %s",id,password,name);
	}

	@Override
	public String toString() {
		return "[" + id + "]님의 정보 >> 이름 : " + "name" + "전화번호 : " + phoneNumber;
	}
}
