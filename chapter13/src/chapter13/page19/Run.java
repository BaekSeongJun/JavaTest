package chapter13.page19;

public class Run {
	public static void main(String[] args) {
		//내부에 있는 인터페이스를 사용해보자
		// B b = new 자식();
		// B b = new B() {};
		A.B b = new A.B(){
			@Override
			public void bcd() {
				System.out.println("다형성구현");
			}
		};
		b.bcd();
		//===========================================
		C c = new C();
		// 부 = 자식객체
		A.B b2 = c;
		b2.bcd();

		//이미지버튼을 생성 이벤트핸들러 등록 처리까지 진행
		ImgButton imgButton = new ImgButton();
		imgButton.setOnDoubleClickListener(new ImgButton.OnDoubleClickListener() {
			@Override
			public void onDoubleClick() {
				System.out.println("고객님 요청하신 이미지를 처리하였습니다.");
			}
		});

		imgButton.doubleClick();
	}
}
