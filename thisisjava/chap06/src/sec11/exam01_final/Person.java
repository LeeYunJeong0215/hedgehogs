package sec11.exam01_final;

public class Person {
	//final �ʵ� : �ʱⰪ�� �ָ� ���� ������ �Ұ����� �ʵ�
	//�ʱⰪ �ִ� ��� 2����(1.�ʵ弱��� 2.�����ڿ���)
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name){
		this.ssn = ssn;
		this.name = name;
	}
}
