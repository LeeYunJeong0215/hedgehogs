package sec08.exam01_method_declaration;

import java.util.Scanner;

public class ComputerExample {

	public static void main(String[] args) {
		Computer myCom = new Computer();
		Scanner scanner = new Scanner(System.in);
		
		//1.�Ű������� �迭Ÿ������ ������ ���� ȣ��
		//1)�迭�� ������� �� ����
		int[] values1 = {1,2,3};
		int result1 = myCom.sum1(values1);
		System.out.println("result1 : " + result1);
		
		//int result2 = myCom.sum1({1,2,3}) �����߻�
		//�̹� �迭Ÿ������ ������ �Ǿ� �����Ƿ� new �����ڸ� �̿��ؼ�
		//���� ��� �ϱ� ����
		//2)�Ű������� �ִ� ���� ���� �迭 ����
		int result2 = myCom.sum1(new int[] {1,2,3});
		System.out.println("result2 : " + result2);
		
		//2.�Ű������� �迭�� �������� �ʰ� ���� ����Ʈ�� �Ѱ��ִ� ��� ȣ��
		int result3 = myCom.sum2(1,2,3);
		//int result3 = myCom.sum2({1,2,3}); �̰� �����߻�
		System.out.println("result3 : " + result3);
		
		int result4 = myCom.sum2(1,2,3,4,5);
		System.out.println("result4 : " + result4);
		
		//�Է� ���� ���� �Ű������� ����Ϸ��µ� ��� �Է¹����� �𸣸�
		//'...'�� �̿��ؼ� �Ű������� �����ϸ� �ǰڱ���.
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int result5 = myCom.sum2(num1, num2);
		System.out.println("result5 : " + result5);
		
		scanner.close();
	}
	

}
