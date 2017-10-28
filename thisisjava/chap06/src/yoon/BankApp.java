package yoon;

import java.util.Scanner;

public class BankApp {

	private static Account[] acc = new Account[100];
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		boolean run = true;

		while (run) {
			System.out.println("----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------");
			System.out.print("선택 > ");

			int selectNo = Integer.parseInt(scan.nextLine());

			switch (selectNo) {

			case 1:
				creatAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run = false;
			default:
				System.out.println("다시 입력하세요");
			}
		}
	}

	private static void withdraw() {
		System.out.println("계좌번호 : ");
		String ano = scan.nextLine();
		System.out.println("출금액 : ");
		int balance = Integer.parseInt(scan.nextLine());
		if (find(ano) != null) {
			find(ano).setBalance(find(ano).getBalance() - balance);
		}
		// for (Account a : acc) {
		// if (a != null && a.getAno().equals(ano)) {
		// a.setBalance(a.getBalance() - balance);
		// }
		// }
		System.out.println("출금 성공 ");
	}

	private static void deposit() {
		System.out.println("계좌번호 : ");
		String ano = scan.nextLine();
		System.out.println("예금액 : ");
		int balance = Integer.parseInt(scan.nextLine());
		if (find(ano) != null) {
			find(ano).setBalance(find(ano).getBalance() + balance);
		}
		// for (Account a : acc) {
		// if (a != null && a.getAno().equals(ano)) {
		// a.setBalance(a.getBalance() + balance);
		// }
		// }
		System.out.println("예금 성공 ");
	}

	private static void accountList() {

		for (Account a : acc) {
			if (a != null) {
				System.out.println(a);
			}
		}
	}

	static int i = 0;

	private static void creatAccount() {
		System.out.println("계좌번호:");
		String ano = scan.nextLine();
		System.out.println("계좌주 : ");
		String owner = scan.nextLine();
		System.out.println("초기 입금액 : ");
		int balance = Integer.parseInt(scan.nextLine());
		acc[i] = new Account(ano, owner, balance);
		i++;
		System.out.println("결과 : 계좌가 생성되었습니다");
	}

	private static Account find(String ano) {
		for (Account a : acc) {
			if (a.getAno().equals(ano)) {
				return a;
			}
		}
		return null;
	}
}