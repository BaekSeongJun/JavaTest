package chapter07.page28;

public class B {
	//멤변
	private int a;
	private int b;
	private int c;
	private int d;
	//생성자
	public B (){
		this(0);
	}
	public B(int a){
		this(a,0);
	}
	public B(int a , int b){
		this(a,b,0);
	}
	public B(int a , int b, int c){
		this(a,b,c,0);
	}
	public B(int a , int b, int c, int d){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	//멤버함수(갯터,셋터,기능,출력)
}
