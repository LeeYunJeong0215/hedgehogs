package sec06.exam01_array_bylist;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		//�迭�� �̸� ������ �� new�����ڸ� ����� ���� �����ϱ�
		int[] scores;
		//scores = {83,90,87}; �̷��� �����ϸ� ���� �߻�(�迭�� �̸� �����߱� ������)
		scores = new int[] {83, 90, 87};
		int sum1 = 0;
		for(int i=0; i<3; i++){
			sum1 += scores[i];
		}
		System.out.println("���� : " + sum1);
		
		//int sum2 = add({83, 90, 87});
		//�����߻�, add�޼ҵ忡 �Ű����� int[] scores�� �����ν� �迭�� �̹� ���������Ƿ�
		//new �����ڸ� �̿��ؼ� �迭�� ���� ��� �ϴ� ��.
		
		int sum2 = add(new int[]{83, 90, 87});
		System.out.println("���� : " + sum2);
	}
	
	public static int add(int[] scores){
		int sum = 0;
		for(int i=0; i<3; i++){
			sum += scores[i];
		}
		return sum;
	}
}
