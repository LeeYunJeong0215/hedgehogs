package sec05.exam03_button_event;
//버튼 클릭 이벤트 처리를 익명구현 객체를 이용해 처리하는 방법을 보여주기 위한 UI클래스 
public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	//1.필드 초기값으로 대입
	Button.OnClickListener listener = new Button.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다");
		}
	};
	//생성자
	Window(){
		button1.setOnClickListener(listener);
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다");
				
			}
		});
	}
	
}
