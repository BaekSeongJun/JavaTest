package chapter13.page19;

public class ImgButton {
	//멤버변수
	private OnDoubleClickListener odc;

	//인터페이스 설계(이벤트처리방법)
	static interface OnDoubleClickListener{
		public abstract void onDoubleClick();
	}

	public void setOnDoubleClickListener(OnDoubleClickListener odc){
		this.odc=odc;
	}
	public void doubleClick(){
		this.odc.onDoubleClick();
	}
}
