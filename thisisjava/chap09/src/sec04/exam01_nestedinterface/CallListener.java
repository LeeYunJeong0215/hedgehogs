package sec04.exam01_nestedinterface;
//구현클래스
public class CallListener implements Button.OnClickListener {
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다");
	}

}
