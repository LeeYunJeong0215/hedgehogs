package sec03.exam01_parent_constructor_call;

public class Student extends People {
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo){
		//super(); �θ�����ڿ� �Ű������� 2�� �����Ƿ� �����߻�.
		super(name, ssn);//super�� ���� ù�ٿ� ����� ��.
		this.studentNo = studentNo;
		System.out.println("�ڽ� ��ü ����");
		
	}
}
