package sec05.exam03_button_event;
//��ø �������̽�
public class Button {
	//2.�������̽� Ÿ�� �ʵ�
	OnClickListener listener;
	
	//3.�������̽� Ÿ������ �Ű������� �޾� �ʵ忡 �����ϴ� Setter�޼ҵ�
	void setOnClickListener(OnClickListener listener){
		this.listener = listener;
		
	}
	//4.��ư �̺�Ʈ �߻��� ����Ǵ� �޼ҵ�
	void touch(){
		listener.onClick();
		
	}
	//1.��ø �������̽�
	interface OnClickListener{
		void onClick();
		
	}
}
