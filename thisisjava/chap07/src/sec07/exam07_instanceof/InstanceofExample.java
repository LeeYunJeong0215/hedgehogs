package sec07.exam07_instanceof;

public class InstanceofExample {

	public static void method1(Parent parent){
		if(parent instanceof Child){
			Child child = (Child)parent;
			System.out.println("method1-Child로 변환 성공");
		}else{
			System.out.println("method1-Child로 변환되지 않음.");
		}
	}
	
	public static void method2(Parent parent){
		Child child = (Child)parent;
		System.out.println("method2-child로 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB); //instanceof로 객체타입확인을 통해 예외처리를 한 결과가 나옴.
		method2(parentB); //ClassCastException발생
	}

}
