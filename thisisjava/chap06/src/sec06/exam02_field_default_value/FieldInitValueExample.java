package sec06.exam02_field_default_value;

public class FieldInitValueExample {

	public static void main(String[] args) {
		FieldIntValue fiv = new FieldIntValue();
		
		//����Ÿ�� �ʱⰪ
		System.out.println("byteFiled : " + fiv.byteField);
		System.out.println("shortFiled : " + fiv.shortField);
		System.out.println("intFiled : " + fiv.intField);
		System.out.println("longFiled : " + fiv.longField);
		//boolean,char(����Ÿ��)�ʱⰪ
		System.out.println("booleanFiled : " + fiv.booleanField);
		//char�� �����ڵ� 0���� ���µ� �����ڵ� 0 ���� ����
		System.out.println("charFiled : " + fiv.charField); 
		//�Ǽ�Ÿ�� �ʱⰪ
		System.out.println("floatFiled : " + fiv.floatField);
		System.out.println("doubleFiled : " + fiv.doubleField);
		//����Ÿ�� �ʱⰪ
		System.out.println("arrFiled : " + fiv.arrField);
		System.out.println("stringFiled : " + fiv.stringField);
		

	}

}
