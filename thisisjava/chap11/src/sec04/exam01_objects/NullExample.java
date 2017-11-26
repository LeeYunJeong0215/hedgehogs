package sec04.exam01_objects;

import java.util.Objects;

public class NullExample {

	public static void main(String[] args) {
		String str1 = "ȫ�浿";
		String str2 = null;
		
		System.out.println(Objects.isNull(str1));
		System.out.println(Objects.isNull(str2));
		System.out.println("-------------------------------");
		System.out.println(Objects.nonNull(str1));
		System.out.println(Objects.nonNull(str2));
		System.out.println("-------------------------------");
		System.out.println(Objects.requireNonNull(str1));
		//System.out.println(Objects.requireNonNull(str2)); 
		//java.lang.NullPointerException �߻�.
		
		//NullPointerException ����ó��
		try{
			String name = Objects.requireNonNull(str2);
		}catch(NullPointerException e){
			System.out.println(e.getMessage()); //null�� ��°� ����.
		}
		System.out.println("-------------------------------");
		//���ܸ޽��� ����.
		try{
			String name = Objects.requireNonNull(str2, "�̸��� �����ϴ�");
		}catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
		System.out.println("-------------------------------");
		//���ٽ����� ���ܸ޽��� ����
		try{
			String name = Objects.requireNonNull(str2, ()->"�̸��� ��3��");
		}catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
		System.out.println("-------------------------------");
	}

}
