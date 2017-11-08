package sec07.exam02_promotion_access;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		//Parent타입의 parent 변수에 child객체를 대입하여 자동타입변환 발생
		Parent parent = child;
		
		parent.mehtod1();
		parent.mehtod2(); //자식클래스에 재정의(오버라이딩)된 method2가 호출됨
		//parent.method3(); 호출불가(Parent클래스에는 method3가 없으므로)
		

	}

}
