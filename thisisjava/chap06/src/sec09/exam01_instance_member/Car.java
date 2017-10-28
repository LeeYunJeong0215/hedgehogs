package sec09.exam01_instance_member;

public class Car {
	String model;
	int speed;
	
	//생성자
	Car(String model){
		this.model = model;
	}
	//메소드
	void setSpeed(int speed){
		this.speed = speed;
	}
	void run(){
		for(int i=10; i<=50; i+=10){
			speed = i;
			System.out.println(model + "가 달립니다(시속 : " + speed + "km/h)");
		}
	}
}
