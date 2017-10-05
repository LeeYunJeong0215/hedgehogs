package chap04_Exercise;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) throws Exception {
		//메뉴출력 후 해당 번호에 맞는 기능 실행
		//while과 scanner 이용
		
		boolean run = true;
		int balance = 0, withdraw = 0, deposit = 0;
		Scanner scanner = new Scanner(System.in);
		int keyCode = 0;
		
		
		while(run){
			if(keyCode != 13 && keyCode != 10){
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택 > ");
			}
			keyCode = System.in.read();//예외처리 필요
			
			switch(keyCode){//ASCII코드 값 1(49)~4(52) 
			case 49:
				System.out.print("예금액 > ");
				deposit = scanner.nextInt();
				balance += deposit;
				break;
			case 50:
				System.out.print("출금액 > ");
				withdraw = scanner.nextInt();
				balance -= withdraw;
				break;
			case 51:
				System.out.print("잔고 > ");
				//balance = deposit - withdraw;
				System.out.println(balance);
				break;
			case 52:
				System.out.println("프로그램 종료");
				run = false;
				scanner.close();
				break;
				
			}
		}
		;
	}

}
