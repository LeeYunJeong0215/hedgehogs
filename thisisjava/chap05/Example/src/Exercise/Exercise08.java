package Exercise;

public class Exercise08 {

	public static void main(String[] args) {
		// �迭 ��ü�� �հ� ��� ���ϱ�
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, 
				{ 78, 83, 93, 87, 88 } };
		int sum = 0;
		double avg = 0.0;
		int arrayLength = 0;
		//�ձ��ϱ�
		for(int i=0; i<array.length; i++){
			for(int j=0; j<array[i].length; j++){
				sum += array[i][j];
			}
		}
		System.out.println("sum : " + sum);
		//��ձ��ϱ�
		for(int j=0; j<array.length; j++){
			arrayLength += array[j].length;
			avg = (double)sum / arrayLength;
		}
		System.out.println("avg : " + avg);

	}

}
