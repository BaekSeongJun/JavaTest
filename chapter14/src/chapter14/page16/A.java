package chapter14.page16;

import java.util.Scanner;

public class A implements AutoCloseable{
	//멤변
	private String name;
	private Scanner scan;
	//생성자
	public A(){
		this(null);
	}
	public A(String name){
		this.name = new String(name);
		this.scan = new Scanner(System.in);
	}

	//멤버함수(getter, setter, function, override(hashcode, equals, toString))
	public void inputName() throws Exception{
		System.out.print("name : ");
		this.name = scan.nextLine();
	}

	public String getName(){
		return this.name;
	}


	@Override
	public void close() throws Exception {
		if(this.scan != null){
			this.scan.close();
		}
		System.out.println("자동으로 scan.close() 처리함");
	}
}
