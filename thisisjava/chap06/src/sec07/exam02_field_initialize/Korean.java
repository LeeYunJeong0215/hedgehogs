package sec07.exam02_field_initialize;

public class Korean {
	//�ʵ� ����
	String nation = "���ѹα�";
	String name;
	String ssn;
	
	//������(�Ű������� �̸��� �ʵ�� �ٸ��� - ���� �̷��� ���� ����)
	/*public Korean(String n, String s){
		name = n;
		ssn = s;
		
	}*/
	
	//������(�Ű������� �̸��� �ʵ��̸��� ����)
	//�����̸��� �ʵ��̸��� ������ ������ ���ο��� �ش��ʵ忡 ������ �� ����
	//�ֳ��ϸ� ������ �̸��� �Ű������� ��� �켱������ ���� �����̴�.
	//�׷��� �Ű������� ������ ���� �ʵ� �տ� .this�� �ٿ��ش�(this.�ʵ�)
	public Korean(String name, String ssn){
		this.name = name;
		this.ssn = ssn;		
	}
}
