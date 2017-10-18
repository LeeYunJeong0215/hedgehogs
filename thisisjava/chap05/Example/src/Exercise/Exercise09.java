package Exercise;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		//�л����� �� �л��� ������ �Է¹޾� �ְ����� �� ��������� ���ϴ� ���α׷�
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run){
			System.out.println("-------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("-------------------------------------------");
			System.out.print("����> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1){
				//�л���
				System.out.print("�л��� > ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				
			}else if(selectNo == 2){
				//�����Է�
				for(int i=0; i<scores.length; i++){
					System.out.print("scores[" + i + "] : ");
					scores[i] = scanner.nextInt();
				}
				
			}else if(selectNo == 3){
				//��������Ʈ(�Էµ� ������ �����ֱ�)
				for(int i=0; i<scores.length; i++){
					System.out.print("scores[" + i + "] : ");
					System.out.println(scores[i]);
				}
			}else if(selectNo == 4){
				//�м�(�ְ�����, ���)
				
				//1. �ְ�����
				int max = 0;
				for(int i=0; i<scores.length; i++){
					//teacher code( ���׿����ڸ� �̿��� �ִ밪 ��� )
					//max = (max<scores[i])?scores[i]:max;
					if(max < scores[i]){
						max = scores[i];
					}
				}
				System.out.println("�ְ����� : " + max);
				
				//2. ���
				int sum = 0;
				for(int score : scores){
					sum += score;
				}
				//double avg = (double)sum / studentNum;
				double avg = (double)sum / scores.length;
				System.out.println("������� : " + avg);
			}else if(selectNo == 5){
				run = false;
			}else{
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
		System.out.println("���α׷� ����");
		scanner.close();
	}

}
