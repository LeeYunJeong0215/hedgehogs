package Exercise;

import java.util.Scanner;

public class BankApplication {
	// ����(static) �ʵ�
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("----------------------------------------");
			System.out.print("���� > ");

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
		System.out.println("���α׷� ����");
	}

	static int i = 0;

	// ���� ����
	private static void createAccount() {

		System.out.println("--------");
		System.out.println("���»���");
		System.out.println("--------");

		System.out.print("���¹�ȣ: ");
		String ano = scanner.nextLine();
		System.out.print("������: ");
		String owner = scanner.nextLine();
		System.out.print("�ʱ��Աݾ�: ");
		int balance = Integer.parseInt(scanner.nextLine());

		accountArray[i] = new Account(ano, owner, balance);
		i++;
		System.out.println("��� : ���°� �����Ǿ����ϴ�.");

		/*
		 * for (int i = 0; i < accountArray.length; i++) { if (i % 3 == 1) {
		 * accountArray[i] = account.setAno(ano); } else if (i % 3 == 2) {
		 * accountArray[i] = account.setOwner(owner); } else if (i % 3 == 0) {
		 * accountArray[i] = account.setBalance(balance); } }
		 */
	}

	// ���¸�Ϻ���
	private static void accountList() {
		System.out.println("--------");
		System.out.println("���¸��");
		System.out.println("--------");

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.printf("%s\t %s\t %s\t\n", accountArray[i].getAno(), accountArray[i].getOwner(),
						accountArray[i].getBalance());

			}
		}

	}

	// �����ϱ�
	private static void deposit() {
		System.out.println("--------");
		System.out.println("�����ϱ�");
		System.out.println("--------");

		System.out.print("���¹�ȣ: ");
		String ano = scanner.nextLine();

		Account findaccount = findAccount(ano);

		System.out.print("���ݾ�: ");
		int balance = Integer.parseInt(scanner.nextLine());
		findaccount.setBalance(balance + findaccount.getBalance());
		System.out.println("������ �����Ͽ����ϴ�.");

	}

	// ����ϱ�
	private static void withdraw() {
		System.out.println("--------");
		System.out.println("����ϱ�");
		System.out.println("--------");

		System.out.print("���¹�ȣ: ");
		String ano = scanner.nextLine();

		Account findaccount = findAccount(ano);

		System.out.print("��ݾ�: ");
		int balance = Integer.parseInt(scanner.nextLine());
		findaccount.setBalance(findaccount.getBalance() - balance);
		System.out.println("����� �����Ͽ����ϴ�.");
	}

	// Account �迭���� ano ������ Account ��ü ã��
	private static Account findAccount(String ano) {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}

		}
		return null;
	}
}
