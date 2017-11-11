package sec04.exam01_nestedinterface;
//버튼 이벤트 처리
public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
		
		//익명 구현 객체를 통해 직접 이벤트처리(이 경우가 더 많음)
		btn.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("사진을 찍습니다");
				
			}
		});
		btn.touch();
	}
}
