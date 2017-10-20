package sec06.exam02_field_default_value;

public class FieldInitValueExample {

	public static void main(String[] args) {
		FieldIntValue fiv = new FieldIntValue();
		
		//정수타입 초기값
		System.out.println("byteFiled : " + fiv.byteField);
		System.out.println("shortFiled : " + fiv.shortField);
		System.out.println("intFiled : " + fiv.intField);
		System.out.println("longFiled : " + fiv.longField);
		//boolean,char(정수타입)초기값
		System.out.println("booleanFiled : " + fiv.booleanField);
		//char는 유니코드 0값이 들어가는데 유니코드 0 값은 공백
		System.out.println("charFiled : " + fiv.charField); 
		//실수타입 초기값
		System.out.println("floatFiled : " + fiv.floatField);
		System.out.println("doubleFiled : " + fiv.doubleField);
		//참조타입 초기값
		System.out.println("arrFiled : " + fiv.arrField);
		System.out.println("stringFiled : " + fiv.stringField);
		

	}

}
