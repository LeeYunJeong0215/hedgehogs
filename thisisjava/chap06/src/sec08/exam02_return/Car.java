package sec08.exam02_return;

public class Car {
	/*
	 * gas를 설정하고 gas값을 받아 gas가 있으면 gas잔량 표시 및 달리므로써 -1씩 gas가 소비된다. gas가 없으면 Car는
	 * 멈춘다.
	 */
	// gas 필드 설정
	int gas;

	// gas값 입력 받을 메소드
	void setGas(int gas) {
		this.gas = gas;
	}

	// 남은 gas가 있는지 여부 출력할 메소드
	boolean isLeftGas() {
		if (gas == 0) { // 왜 this.gas가 아니라 그냥 gas지?
						//this.gas를 써도 결과는 똑같다.
						//아마 class에 int gas 선언이 되어있어서 다 같이 쓸수 있는 것 같다.
						//this.gas를 하지 않아도 매개변수가 없기때문에 gas필드라는걸 인식하는듯.
			System.out.println("gas가 없습니다");
			return false;
		}
		System.out.println("gas가 있습니다");
		return true;
	}

	// 차가 달리면 가스가 소비되고 0이면 멈추는 메소드
	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다.(gas잔량 :" + gas + ")");
				gas--;
			} else {
				System.out.println("멈춥니다.(gas잔량 :" + gas + ")");
				return; // break를 써도 됨.
			}
		}
	}
}
