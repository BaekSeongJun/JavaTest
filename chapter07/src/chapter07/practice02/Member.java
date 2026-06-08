package chapter07.practice02;

public class Member {
	private int memberId;
	private String name;
	private int age;
	private String gender;
	private String phoneNumber;
	private String email;

	public Member() {
		this(null, 0, null, null, null);
	}

	public Member(String name, int age, String gender, String phoneNumber, String email){
		this.memberId = (int)(Math.random()*100) + 1;
		this.name = name;
		this.age = age;
		this.gender = normalizeGender(gender);
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private String normalizeGender(String gender){
		if(gender.toUpperCase().equals("m".toUpperCase()) || gender.equals("남자") || gender.equals("남")){
			return "M";
		}else if(gender.toUpperCase().equals("f".toUpperCase()) || gender.equals("여자") || gender.equals("여")){
			return "F";
		}else{
			System.out.println("잘못된 입력입니다.");
			return null;
		}
	}

	public int isAdult(){
		if (age <0){
			System.out.println("나이는 음수 일 수 없습니다.");
			return -1;
		}else if(age < 20){
			System.out.println("청소년입니다.");
			return 0;
		}
		System.out.println("성인입니다.");
		return 1;
	}

	public boolean isSameMember(Member member){
		if(this.email.equals(member.email) && this.phoneNumber.equals(member.phoneNumber)){
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Member{" +
			"memberId=" + memberId +
			", name='" + name + '\'' +
			", age=" + age +
			", gender='" + gender + '\'' +
			", phoneNumber='" + phoneNumber + '\'' +
			", email='" + email + '\'' +
			'}';
	}
}
