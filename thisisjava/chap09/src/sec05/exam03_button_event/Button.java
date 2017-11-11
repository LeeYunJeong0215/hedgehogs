package sec05.exam03_button_event;
//중첩 인터페이스
public class Button {
	//2.인터페이스 타입 필드
	OnClickListener listener;
	
	//3.인터페이스 타입으로 매개변수를 받아 필드에 대입하는 Setter메소드
	void setOnClickListener(OnClickListener listener){
		this.listener = listener;
		
	}
	//4.버튼 이벤트 발생시 실행되는 메소드
	void touch(){
		listener.onClick();
		
	}
	//1.중첩 인터페이스
	interface OnClickListener{
		void onClick();
		
	}
}
