package sec07.exam01_promotion;

public class PromotionExample {
	//����Ÿ�Կ����� �ڵ�Ÿ�Ժ�ȯ
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//�θ�Ŭ������ AŸ������ ��ü ����
		//�ٷ� �� �θ� �ƴ϶� ���� Ÿ���̸� �ڵ�Ÿ�� ��ȯ �߻�
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		//B b2 = e; ��Ӱ��谡 �ƴϹǷ� ������ ���� �߻�
		
		//C c1 = d; ��Ӱ��谡 �ƴϹǷ� ������ ���� �߻�
		C c2 = e;

	}

}
