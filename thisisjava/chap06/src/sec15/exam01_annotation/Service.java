package sec15.exam01_annotation;

public class Service {
	@PrintAnnotation
	public void mehtod1() {
		System.out.println("���� ���� 1");
	}
	@PrintAnnotation("*")
	public void mehtod2() {
		System.out.println("���� ���� 2");
	}
	@PrintAnnotation(value="#", number=20)
	public void mehtod3() {
		System.out.println("���� ���� 3");
	}

}
