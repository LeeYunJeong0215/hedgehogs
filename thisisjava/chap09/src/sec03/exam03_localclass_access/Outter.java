package sec03.exam03_localclass_access;
//로컬 클래스 에서의 사용 제한
public class Outter {
	// 자바 7 이전
	public void method1(final int arg) {// 메소드의 매개변수와
		final int localVariable = 1;// 메소드의 로컬변수를
		// final 특성을 가지므로 초기 값 변경 불가.
		// arg = 100;
		// localVariable = 4;
		class inner {
			public void method() {
				// 로컬 클래스(메소드 내의 클래스)에서 사용하려고 할때
				// final 선언시 method내의 로컬 변수로 
				// 메소드의 매개변수와 로컬변수를 복사(p.399)참고
				int result = arg + localVariable;
				// 메소드의 매개변수와 메소드의 로컬변수에 final을 붙여주지 않으면 에러 발생
			}
		}
	}

	// 자바 8 이후
	public void method2(int arg) {// 메소드의 매개변수
		int localVariable = 1;// 메소드의 로컬변수
		// final 특성을 가지므로 로컬 클래스 내에서 값이 쓰이면 초기 값 변경 불가.
		// arg = 100;
		localVariable = 4; // 로컬 클래스 내에서 변수가 쓰이지 않으면 값 변경 가능.
		class inner {
			//메소드의 매개변수와 로컬변수에 final을 붙이지 않으면
			//변수들을 클래스 내의 필드로 복사해 사용
			public void method() {
				// 로컬 클래스(메소드 내의 클래스)에서 사용하려고 할때
				int result = arg;
				// 메소드의 매개변수와 메소드의 로컬변수에 final을 붙여주지 않아도 됨
				// final을 써주지 않아도 메소드의 매개변수와 로컬변수는 final의 특성은 갖는다.
				// 또한 final을 명시적으로 써줘도 된다.
				// 
			}
		}
	}
}