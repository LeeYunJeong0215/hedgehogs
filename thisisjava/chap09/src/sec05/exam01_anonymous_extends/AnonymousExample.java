package sec05.exam01_anonymous_extends;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();

		// 익명자식객체가 재정의한 메소드 호출
		anony.field.wake();
		// 익명자식객체를 로컬변수로 사용한 메소드 호출
		anony.method1();
		// 익명 객체를 메소드 호출 값으로 사용
		anony.method2(new Person() {
			void study() {
				System.out.println("공부를 합니다");
			}

			@Override
			void wake() {
				System.out.println("8시에 일어납니다");
				study();
			}

		});
	}
}
