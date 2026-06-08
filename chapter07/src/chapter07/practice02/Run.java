package chapter07.practice02;

import java.util.Scanner;

public class Run {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean exitFlag = false;
		while (!exitFlag) {
			System.out.println("1.동물원, 2.제품, 3.책, 4.동물원배열, 5.회원 6.exit");
			System.out.print("번호 입력 : ");
			int no = Integer.parseInt(sc.nextLine());
			switch (no) {
				case 1:
					zooPractice();
					break;
				case 2:
					productPractice();
					break;
				case 3:
					bookPractice();
					break;
				case 4:
					zooArrayPractice();
					break;
				case 5:
					memberPractice();
					break;
				case 6:
					exitFlag = true;
					System.out.println("exit 프로그램을 종료합니다.");
					break;
				default:
					System.out.println("잘못된 입력입니다. 다시 입력해주세요");
					break;
			}
		}

		if(sc != null){
			sc.close();
		}
		System.out.println("The end");
	}
	public static void zooPractice() {
		System.out.println("동물원입니다");

		Zoo zoo = new Zoo("BSJZOO", "경기도 성남시");
		int animalCount = 0;

		while (animalCount != -1){
			System.out.print("동물원에 추가할 동물을 입력해주세요 : ");
			animalCount = zoo.addAnimal(sc.nextLine());
		}
		zoo.showZooInfo();
	}
	public static void productPractice() {
		System.out.println("제품입니다");
		Product[] products = new Product[2];

		for(int i = 0; i < products.length; i++){
			products[i] = new Product();
			System.out.print("제품명 입력 : ");
			products[i].setProductName(sc.nextLine());
			System.out.print("제품가격 입력 : ");
			products[i].setPrice(Integer.parseInt(sc.nextLine()));
			System.out.print("제품 브랜드명 입력 : ");
			products[i].setBrand(sc.nextLine());
		}
		for(Product product : products){
			product.information();
		}
	}
	public static void bookPractice() {
		System.out.println("책입니다");

		Book[] books = new Book[3];
		// books[0] = new Book();
		// books[1] = new Book("클린 코드", "인사이트", "로버트 C. 마틴");
		// books[2] = new Book("실용주의 프로그래머", "인사이트", "앤드류 헌트, 데이비드 토마스", 35000, 0.15);
		//
		// books[0].setTitle("객체지향의 사실과 오해");
		// books[0].setAuthor("조영호");
		// books[0].setPublisher("위키북스");
		// books[0].setPrice(25000);
		// books[0].setDiscountRate(0.1);
		//
		// books[1].setPrice(38000);
		// books[1].setDiscountRate(0.15);
		for(int i = 0 ; i < books.length; i++) {
			books[i] = new Book();
			System.out.print("도서명 입력 : ");
			books[i].setTitle(sc.nextLine());
			System.out.print("저자명 입력 : ");
			books[i].setAuthor(sc.nextLine());
			System.out.print("출판사명 입력 : ");
			books[i].setPublisher(sc.nextLine());
			System.out.print("가격 입력 : ");
			books[i].setPrice(Integer.parseInt(sc.nextLine()));
			System.out.print("할인율 입력 : ");
			books[i].setDiscountRate(Double.parseDouble(sc.nextLine()));
		}
		for(Book book : books){
			book.inform();
		}
	}
	public static void zooArrayPractice() {
		Zoo[] zoos = new Zoo[3];
		for(int i = 0; i < zoos.length; i++) {
			zoos[i] = new Zoo();
			System.out.print("동물원 이름 입력 : ");
			zoos[i].setName(sc.nextLine());
			System.out.print("동물원 위치 입력 : ");
			zoos[i].setLocation(sc.nextLine());
			int animalCount = 0;
			while(animalCount != -1){
				System.out.print("동물원에 등록할 동물 입력 : ");
				animalCount = zoos[i].addAnimal(sc.nextLine());
			}
			System.out.printf("%s 세팅이 끝났습니다.\n",zoos[i].getName());
		}
		for(Zoo zoo : zoos){
			zoo.showZooInfo();
		}
	}
	public static void memberPractice() {
		Member[] members = new Member[3];
		members[0] = new Member("백성준", 28, "남","010-1234-5678","example@example.com");
		members[1] = new Member("홍길동", -1, "m","010-1234-5678","example@example.com");
		members[2] = new Member("김길현", 14, "f","010-1234-5678","example@example.com");

		for(Member member : members){
			member.isAdult();
			System.out.println(member);
		}


	}
	public static String randomString(int start, int end){
		String str = "";
		int length = (int)Math.random()*((end-start+1)+start);
		for(int i = 0; i < length; i++){
			str += (char)((int)(Math.random()*(55203-44032+1)+44032));
		}
		return str;
	}
}
