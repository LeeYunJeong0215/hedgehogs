package sec06.exam08_advance_for;

public class AdvancedForExample {

	public static void main(String[] args) {
		//���� for���� �̿��� sum,avg ���ϱ�
		int[] scores = {95,71,84,93,87};
		int sum = 0;
		
		for(int score :  scores){ //Ÿ�� ���� : ������ �迭
			sum += score;
		}
		System.out.println("���� : " + sum);
		
		double avg = (double)sum / scores.length;
		System.out.println("��� : " + avg);
	}

}
