package sec08.exam01_method_declaration;

public class Computer {
	//�Ű������� ���� �� ���
	//1. �Ű������� �迭Ÿ������ ����
	int sum1(int[] values){
		int sum = 0;
		for(int i=0; i<values.length; i++){
			sum += values[i];
		}
		return sum;
	}
	//2. �Ű������� �迭�� �������� �ʰ� ���� ����Ʈ�� �Ѱ��ִ� ���
	int sum2(int ... values){
		int sum = 0;
		for(int i=0; i<values.length; i++){
			sum += values[i];
		}
		return sum;
	}
}
