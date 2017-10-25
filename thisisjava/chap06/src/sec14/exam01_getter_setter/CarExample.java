package sec14.exam01_getter_setter;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		//private 접근제한자를 가진 필드이므로 직접 접근 불가
		//System.out.println(myCar.speed);
		//System.out.println(myCar.stop);
		
		myCar.setSpeed(60);
		myCar.setStop(false);
		
		System.out.println(myCar.getSpeed());
		System.out.println(myCar.isStop());
		
		//getter()와 setter()에 조건 없이 같이주면 private를
		//쓰는 의미가 없다. 값을 읽고 바꾸는게 자유롭기 때문이다.
		
		//잘못된 속도 변경
		myCar.setSpeed(-50);
		System.out.println("현재속도 : " + myCar.getSpeed());
		//올바른 속도 변경
		myCar.setSpeed(60);
		System.out.println("현재속도 : " + myCar.getSpeed());
		
		//멈춤
		if(!myCar.isStop()){//isStop()리턴값이 false일 경우
			myCar.setStop(true);
		}
		
		System.out.println("현재속도 : " + myCar.getSpeed());
	}

}
