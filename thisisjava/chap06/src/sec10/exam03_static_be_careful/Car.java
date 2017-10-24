package sec10.exam03_static_be_careful;

public class Car {
	int speed;
	
	void run(){
		System.out.println(speed + "km/h으로 달립니다");
	}
	
	public static void main(String[] args){
		//오류발생(main()도 static으로 정적 메소드이므로
		//인스턴스 멤버를 사용하려면 new 생성자로 객체를 생성하고 사용해야 함.
		/*speed = 60;
		run();*/
		
		Car myCar = new Car();
		
		myCar.speed = 60;
		myCar.run();
	}
}
