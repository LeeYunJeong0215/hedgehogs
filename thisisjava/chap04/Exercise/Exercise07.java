package chap04_Exercise;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) throws Exception {
		//�޴���� �� �ش� ��ȣ�� �´� ��� ����
		//while�� scanner �̿�
		
		boolean run = true;
		int balance = 0, withdraw = 0, deposit = 0;
		Scanner scanner = new Scanner(System.in);
		int keyCode = 0;
		
		
		while(run){
			if(keyCode != 13 && keyCode != 10){
			System.out.println("----------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("----------------------------");
			System.out.print("���� > ");
			}
			keyCode = System.in.read();//����ó�� �ʿ�
			
			switch(keyCode){//ASCII�ڵ� �� 1(49)~4(52) 
			case 49:
				System.out.print("���ݾ� > ");
				deposit = scanner.nextInt();
				balance += deposit;
				break;
			case 50:
				System.out.print("��ݾ� > ");
				withdraw = scanner.nextInt();
				balance -= withdraw;
				break;
			case 51:
				System.out.print("�ܰ� > ");
				//balance = deposit - withdraw;
				System.out.println(balance);
				break;
			case 52:
				System.out.println("���α׷� ����");
				run = false;
				scanner.close();
				break;
				
			}
		}
		;
	}

}
