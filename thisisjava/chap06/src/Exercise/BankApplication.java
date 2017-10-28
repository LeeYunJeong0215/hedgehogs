package Exercise;

import java.util.Scanner;

public class BankApplication {
	// 정적(static) 필드
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------");
			System.out.print("선택 > ");

			int selectNo = Integer.parseInt(scanner.nextLine());

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	static int i = 0;

	// 계좌 생성
	private static void createAccount() {

		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");

		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		System.out.print("계좌주: ");
		String owner = scanner.nextLine();
		System.out.print("초기입금액: ");
		int balance = Integer.parseInt(scanner.nextLine());

		accountArray[i] = new Account(ano, owner, balance);
		i++;
		System.out.println("결과 : 계좌가 생성되었습니다.");

		/*
		 * for (int i = 0; i < accountArray.length; i++) { if (i % 3 == 1) {
		 * accountArray[i] = account.setAno(ano); } else if (i % 3 == 2) {
		 * accountArray[i] = account.setOwner(owner); } else if (i % 3 == 0) {
		 * accountArray[i] = account.setBalance(balance); } }
		 */
	}

	// 계좌목록보기
	private static void accountList() {
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.printf("%s\t %s\t %s\t\n", accountArray[i].getAno(), accountArray[i].getOwner(),
						accountArray[i].getBalance());

			}
		}

	}

	// 예금하기
	private static void deposit() {
		System.out.println("--------");
		System.out.println("예금하기");
		System.out.println("--------");

		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();

		Account findaccount = findAccount(ano);

		System.out.print("예금액: ");
		int balance = Integer.parseInt(scanner.nextLine());
		findaccount.setBalance(balance + findaccount.getBalance());
		System.out.println("예금이 성공하였습니다.");

	}

	// 출금하기
	private static void withdraw() {
		System.out.println("--------");
		System.out.println("출금하기");
		System.out.println("--------");

		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();

		Account findaccount = findAccount(ano);

		System.out.print("출금액: ");
		int balance = Integer.parseInt(scanner.nextLine());
		findaccount.setBalance(findaccount.getBalance() - balance);
		System.out.println("출금이 성공하였습니다.");
	}

	// Account 배열에서 ano 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}

		}
		return null;
	}
}
