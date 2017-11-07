package sec08.exam01_abstract_class;

public class PhoneExample {

	public static void main(String[] args) {
		//추상 클래스이므로 new생성자를 이용해 객체를 만드는건 불가능.
		//Phone phone = new Phone();
		
		//자식객체를 생성하여 부모객체를 불러오는건 가능.
		SmartPhone smartphone = new SmartPhone("홍길동");
		
		smartphone.turnOn();
		smartphone.InternetSearch();
		smartphone.turnOff();
	}

}
