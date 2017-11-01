package sec07.exam01_promotion;

public class PromotionExample {
	//참조타입에서의 자동타입변환
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//부모클래스인 A타입으로 객체 참조
		//바로 위 부모가 아니라도 상위 타입이면 자동타입 변환 발생
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		//B b2 = e; 상속관계가 아니므로 컴파일 에러 발생
		
		//C c1 = d; 상속관계가 아니므로 컴파일 에러 발생
		C c2 = e;

	}

}
