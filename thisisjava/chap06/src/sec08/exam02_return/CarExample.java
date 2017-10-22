package sec08.exam02_return;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		//가스 주입
		myCar.setGas(5);
		//gasState라는 변수에 myCar.isLeftGas()의 리턴값 저장.
		boolean gasState = myCar.isLeftGas();
		if(gasState){//gasState가 true이면 실행
			System.out.println("출발합니다");
			myCar.run();
		}
		if(myCar.isLeftGas()){//if 조건문에 이렇게 넣어줘도 된다.
			System.out.println("gas를 주입할 필요가 없습니다");
		}else{
			System.out.println("gas를 주입하세요");
		}
	}

}
