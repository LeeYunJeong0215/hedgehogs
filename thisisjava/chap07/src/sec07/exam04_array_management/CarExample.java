package sec07.exam04_array_management;

public class CarExample {
	public static void main(String[] args){
	Car car = new Car();
	
	for(int i=1; i<=5; i++){
		int problemLocation = car.run();
		if(problemLocation != 0){
			System.out.println(car.tires[problemLocation-1].location + 
					"HankookTire로 교체");
			car.tires[problemLocation - 1] =
					new HankookTire(car.tires[problemLocation - 1].location, 15);
		}
		/*switch(problemLocation){
			case 1:
				//car객체의 Tire필드에 HankookTire객체 대입(즉, 자동타입변환)	
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				//car객체의 Tire필드에 HankookTire객체 대입(즉, 자동타입변환)	
				car.frontRightTire = new HankookTire("앞오른쪽", 13);
				break;
			case 3:
				//car객체의 Tire필드에 KumhoTire객체 대입(즉, 자동타입변환)	
				car.backLeftTire = new KumhoTire("뒤왼쪽", 14);
				break;
			case 4:
				//car객체의 Tire필드에 KumhoTire객체 대입(즉, 자동타입변환)	
				car.backRightTire = new KumhoTire("뒤오른쪽", 17);
				break;
			
		}*/
		System.out.println("------------------------------------------");
	}
	
	}
}
