package sec05.exam03_button_event;
//��ư Ŭ�� �̺�Ʈ ó���� �͸��� ��ü�� �̿��� ó���ϴ� ����� �����ֱ� ���� UIŬ���� 
public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	//1.�ʵ� �ʱⰪ���� ����
	Button.OnClickListener listener = new Button.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("��ȭ�� �̴ϴ�");
		}
	};
	//������
	Window(){
		button1.setOnClickListener(listener);
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("�޽����� �����ϴ�");
				
			}
		});
	}
	
}
