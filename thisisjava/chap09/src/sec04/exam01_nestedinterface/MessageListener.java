package sec04.exam01_nestedinterface;
//구현클래스
public class MessageListener implements Button.OnClickListener {
	@Override
	public void onClick() {
		System.out.println("메시지를 보냅니다");
	}

}
