package sec11.exam01_final;

public class PersonExample {

	public static void main(String[] args) {
		Person person = new Person("123456 - 7890123", "������");
		
		System.out.println(person.nation);
		System.out.println(person.ssn);
		System.out.println(person.name);
		
		//nation�� ssn�� final�ʵ��̹Ƿ� �� ���� �Ұ�,�����߻�
		/*person.nation = "USA";
		person.ssn = "123456 - 3253613";*/
		
		//name�ʵ�� final�ʵ尡 �ƴϹǷ� ���� ����.
		person.name = "�Ҷ���";
		System.out.println(person.name);
	}

}

