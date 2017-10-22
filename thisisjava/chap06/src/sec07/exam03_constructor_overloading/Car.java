package sec07.exam03_constructor_overloading;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car(){
	}
	
	Car(String model){
		this.model = model;
	}
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	/*이 경우는 생성자 오버로딩이 아님.(오류발생)
	매개변수의 자료형이 String, int로 같고 순서도 똑같고 갯수도 똑같으므로
	매개변수의 이름이 다른 것은 전혀 관계가 없음.
	Car(String color,String model, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}*/
	//이 경우는 오버로딩이 맞음, 순서가 다르기 때문에
	Car(int maxSpeed,String color,String model){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
