package chapter07.practice;

import java.util.Scanner;

import chapter07.practice02.Book;

public class Run {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		boolean exitFlag = false;
		while (!exitFlag) {
			System.out.println("============================================================================");
			System.out.println("1.1번 문제 2. 2번 문제 3.exit");
			System.out.print("번호 입력 : ");
			int choice = Integer.parseInt(scan.nextLine());
			System.out.println("============================================================================");
			switch (choice) {
				case 1:
					practice01();
					break;
				case 2:
					practice02();
					break;
				case 3:
					exitFlag = true;
					System.out.println("exit을 입력하셨습니다. 프로그램을 종료합니다");
					break;
				default:
					System.out.println("잘못된 입력입니다. 다시 입력해주세요!!!");
					break;
			}

		}
		if (scan != null) {
			scan.close();
		}
		System.out.println("the end");
	}


	public static void practice01() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("1번문제입니다.");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println();

		Product[] products = new Product[2];
		for(int i = 0; i < products.length; i++){
			products[i] = new Product();
			System.out.print("제품 이름 : ");
			products[i].setProductName(scan.nextLine());
			System.out.print("제품 가격 : ");
			products[i].setPrice(Integer.parseInt(scan.nextLine()));
			System.out.print("제품 브랜드 : ");
			products[i].setBrand(scan.nextLine());
		}
		for (Product product : products) {
			product.information();
		}

	}

	private static void practice02() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("2번문제입니다.");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println();

		chapter07.practice02.Book[] books = new chapter07.practice02.Book[3];
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
			books[i] = new chapter07.practice02.Book();
			System.out.print("도서명 입력 : ");
			books[i].setTitle(scan.nextLine());
			System.out.print("저자명 입력 : ");
			books[i].setAuthor(scan.nextLine());
			System.out.print("출판사명 입력 : ");
			books[i].setPublisher(scan.nextLine());
			System.out.print("가격 입력 : ");
			books[i].setPrice(Integer.parseInt(scan.nextLine()));
			System.out.print("할인율 입력 : ");
			books[i].setDiscountRate(Double.parseDouble(scan.nextLine()));
		}
		for(Book book : books){
			book.inform();
		}
	}
}
