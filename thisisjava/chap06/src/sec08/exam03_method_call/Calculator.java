package sec08.exam03_method_call;

public class Calculator {
	int plus(int x, int y){
		int result = x + y;
		return result;
	}
	double avg(int x, int y){
		//avg�� double�̹Ƿ� double�� ����ȯ�Ͽ� �޴´�
		double sum = plus(x, y);//plus()�޼ҵ� ���� ȣ��
		double result = sum / 2.0;
		return result;
	}
	void execute(){
		//avg()�޼ҵ� ���� ȣ���� ���� ���� �޴´�.
		double result = avg(7, 10);
		println("������ : " + result);
	}
	void println(String message){//String���� ���� ǥ�þ��ߴ���
								//�� �� ��� ������ ����.
		System.out.println(message);
	}
}
