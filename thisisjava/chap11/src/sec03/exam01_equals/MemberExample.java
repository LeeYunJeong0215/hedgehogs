package sec03.exam01_equals;

public class MemberExample {
	public static void main(String[] args){
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		//equals() �޼ҵ带 �������̵� ������ �ʾ��� ���� obj1 == obj2�� ����
		//�� ��ü�� ������ ���Ͽ� ������ Ȯ��.
		/*if(obj1 == obj2){
			System.out.println("obj1�� obj2�� ����");
		}else{
			System.out.println("obj1�� obj2�� �������� �ʴ�");
		}
		*/
		if(obj1.equals(obj2)){
			System.out.println("obj1�� obj2�� ����");
		}else{
			System.out.println("obj1�� obj2�� �������� �ʴ�");
		}
		
		if(obj1.equals(obj3)){
			System.out.println("obj1�� obj3�� ����");
		}else{
			System.out.println("obj1�� obj3�� �������� �ʴ�");
		}
	}
}
