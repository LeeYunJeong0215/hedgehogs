package yoon;

import java.util.Scanner;

public class BankApp {

	private static Account[] acc = new Account[100];
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		boolean run = true;

		while (run) {
			System.out.println("----------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("----------------------------------------");
			System.out.print("���� > ");

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
				System.out.println("�ٽ� �Է��ϼ���");
			}
		}
	}

	private static void withdraw() {
		System.out.println("���¹�ȣ : ");
		String ano = scan.nextLine();
		System.out.println("��ݾ� : ");
		int balance = Integer.parseInt(scan.nextLine());
		if (find(ano) != null) {
			find(ano).setBalance(find(ano).getBalance() - balance);
		}
		// for (Account a : acc) {
		// if (a != null && a.getAno().equals(ano)) {
		// a.setBalance(a.getBalance() - balance);
		// }
		// }
		System.out.println("��� ���� ");
	}

	private static void deposit() {
		System.out.println("���¹�ȣ : ");
		String ano = scan.nextLine();
		System.out.println("���ݾ� : ");
		int balance = Integer.parseInt(scan.nextLine());
		if (find(ano) != null) {
			find(ano).setBalance(find(ano).getBalance() + balance);
		}
		// for (Account a : acc) {
		// if (a != null && a.getAno().equals(ano)) {
		// a.setBalance(a.getBalance() + balance);
		// }
		// }
		System.out.println("���� ���� ");
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
		System.out.println("���¹�ȣ:");
		String ano = scan.nextLine();
		System.out.println("������ : ");
		String owner = scan.nextLine();
		System.out.println("�ʱ� �Աݾ� : ");
		int balance = Integer.parseInt(scan.nextLine());
		acc[i] = new Account(ano, owner, balance);
		i++;
		System.out.println("��� : ���°� �����Ǿ����ϴ�");
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