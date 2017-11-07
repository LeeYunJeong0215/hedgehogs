package sec08.exam02_abstract_method;

//public class Dog extends Animal{ }만 존재시 에러 발생
//자식클래스라면 반드시 오버라이딩 해야하는 추상메소드를 오버라이딩 하지 않았기 때문.
public class Cat extends Animal{
	public Cat(){
		this.kind = "포유류";
	}
	@Override
	public void sound() {
		System.out.println("야옹");
		
	}

}
