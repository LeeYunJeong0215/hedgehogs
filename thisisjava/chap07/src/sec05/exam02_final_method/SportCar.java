package sec05.exam02_final_method;

public class SportCar extends Car{

	@Override
	public void speedUp() {
		speed += 10;
	}
	
	//stop()메소드는 final 메소드이므로 자식클래스에서 재정의 할 수 없다.
	//@Override
	//public void stop(){
	
	//}
}
