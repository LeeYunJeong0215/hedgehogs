package sec05.exam01_anonymous_extends;
//anonymous child class
public class Anonymous {
	//1. 필드 초기값으로 대입
	Person field = new Person(){
		void work(){
			System.out.println("출근합니다");
		}
		@Override
		void wake() {
			System.out.println("6시에 일어납니다");
			work();
		}
	};
	
	//2.로컬 변수 값으로 대입
	void method1(){
		Person localVar = new Person(){
			void walk(){
				System.out.println("산책합니다");
			}
			@Override
			void wake() {
				System.out.println("7시에 일어납니다");
				walk();
			}
		};
		localVar.wake();
	}
	//3.메소드 호출 시 매개값으로 자식 익명 객체를 사용하기 위한 메소드정의
	void method2(Person person){
		person.wake();
	}
	
	
}
