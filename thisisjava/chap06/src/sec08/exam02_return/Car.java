package sec08.exam02_return;

public class Car {
	/*
	 * gas�� �����ϰ� gas���� �޾� gas�� ������ gas�ܷ� ǥ�� �� �޸��Ƿν� -1�� gas�� �Һ�ȴ�. gas�� ������ Car��
	 * �����.
	 */
	// gas �ʵ� ����
	int gas;

	// gas�� �Է� ���� �޼ҵ�
	void setGas(int gas) {
		this.gas = gas;
	}

	// ���� gas�� �ִ��� ���� ����� �޼ҵ�
	boolean isLeftGas() {
		if (gas == 0) { // �� this.gas�� �ƴ϶� �׳� gas��?
						//this.gas�� �ᵵ ����� �Ȱ���.
						//�Ƹ� class�� int gas ������ �Ǿ��־ �� ���� ���� �ִ� �� ����.
						//this.gas�� ���� �ʾƵ� �Ű������� ���⶧���� gas�ʵ��°� �ν��ϴµ�.
			System.out.println("gas�� �����ϴ�");
			return false;
		}
		System.out.println("gas�� �ֽ��ϴ�");
		return true;
	}

	// ���� �޸��� ������ �Һ�ǰ� 0�̸� ���ߴ� �޼ҵ�
	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("�޸��ϴ�.(gas�ܷ� :" + gas + ")");
				gas--;
			} else {
				System.out.println("����ϴ�.(gas�ܷ� :" + gas + ")");
				return; // break�� �ᵵ ��.
			}
		}
	}
}
