package sec08.exam01_method_declaration;

public class Calculator {

	//���ϰ�, �Ű������� ���� �޼ҵ�
	void powerOn(){
		System.out.println("������ �մϴ�");
	}
	//���ϰ�, �Ű������� �ִ� �޼ҵ�
	int plus(int x, int y){
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y){
		double result = (double)x / (double)y;
		return result;
	}
}
