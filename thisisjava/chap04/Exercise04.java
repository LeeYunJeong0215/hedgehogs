package chap04_Exercise;

public class Exercise04 {

	public static void main(String[] args) {
		// 2���� �ֻ����� �������� ������
		// while�� Math.random()�޼ҵ带 �̿��Ѵ�
		// ���� ���� 5�� �ƴϸ� �ֻ����� ��� ������, 5�� �Ǹ� ������ �����
				boolean run = true;
		
		while(run) {
			int dice1 = (int) (Math.random() * 6) + 1;
			int dice2 = (int) (Math.random() * 6) + 1;
			System.out.println("(" + dice1 + "," + dice2 + ")");
			if(dice1 + dice2 == 5){
				run = false;
			}
		}

	}

}
