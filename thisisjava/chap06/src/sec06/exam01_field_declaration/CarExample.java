package sec06.exam01_field_declaration;

public class CarExample {

	public static void main(String[] args) {
		//외부클래스에서 Car 필드값 읽기와 변경
		
		//myCar라는 변수에 Car객체 생성
		Car myCar = new Car();
		
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		
		//필드값 변경
		myCar.speed = 60;
		System.out.println("현재속도 : " + myCar.speed);
		

	}

}
