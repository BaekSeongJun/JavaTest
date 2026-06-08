package chapter07.page02;

public class A {
	//멤버 변수 정수형정보 두개값
	private int m;
	private int n;

	public A(){
		this(0,0);
	}
	//생성자(디생,매생)
	public A(int m, int n) {
		this.m = m;
		this.n = n;
	}

	public int getM (){
		return m;
	}
	public int getN (){
		return n;
	}

	public void setM(int m){
		this.m = m;
	}
	public void setN(int n){
		this.n = n;
	}

	public void work1(){
		int k =5;
		System.out.printf("k = %d \n",k);
		work2(3);
	}

	public void work2(int i){
		int j = 4;
		System.out.printf("%d + %d = %d \n",i,j,i+j);
	}

	// public void work3(){
	// 	int k;
	// 	System.out.printf("지역변수k = %d\n", k);
	// }

	@Override
	public String toString(){
		return "A [m=" + m + ", n=" + n + "]";
	}
}
