package chuseock_Exercise;

public class exam01_Fibonacci {

	public static void main(String[] args) {
		/*[���� 1] for���� �̿���  Fibonacci ����
		- �Ǻ���ġ �����̶� ó�� �� ���� 1�� 1�� �� ��, 
		�� ���� �׺��ʹ� �ٷ� ���� �� ���� ���� ���� ����� ������ ���Ѵ�. 
		���� ������ for���� ����Ͽ� ����Ѵ�.
		 
		1  1  2  3  5  8  13  21  34  55	 
*/		
		//ù��° Ǯ�� : �迭���(��ȿ����)
		int[] numbers = new int[10];
		int sum= 0;
		
		numbers[0] = 1;
		numbers[1] = 1;
		System.out.print(numbers[0] + ", " + numbers[1]);
		
		for(int i = 0; i<numbers.length-2; i++){
			sum = numbers[i] + numbers[i+1];
			System.out.print(", " + sum);
			numbers[i+2] = sum;	
		}
		//�ι�° Ǯ�� : �迭�� ���� �ʰ� Ǫ�� ����� �����غ���
	}

}
