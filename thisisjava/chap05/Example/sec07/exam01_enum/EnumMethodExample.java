package sec07.exam01_enum;

public class EnumMethodExample {

	public static void main(String[] args) {
		// 열거타입 메소드 실습(Week.java)
		// name() : 열거객체 문자열 리턴
		Week today = Week.SUNDAY; // 열거변수 선언 및 열거상수 대입
		String name = today.name();
		System.out.println(name);

		// ordinal() : 열거객체 순서 리턴
		int ordinal = today.ordinal();
		System.out.println(ordinal);

		// compareTo() : 순번 비교 리턴
		Week today1 = Week.MONDAY;
		Week today2 = Week.WEDNESDAY;

		int result1 = today1.compareTo(today2);// 0-2
		System.out.println(result1);
		int result2 = today2.compareTo(today1);
		System.out.println(result2);

		// valueOf() : 매개값인 문자열과 동일한 문자열을 가지는 열거 객체(주소?)리턴
		Week weekDay = Week.valueOf("SUNDAY");
		System.out.println(weekDay);//주소가 아니라 객체를 리턴
		if (weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
			System.out.println("주말이군요");
		} else {
			System.out.println("평일이군요");
		}
		//values() : 열거타입의 모든 열거객체들을 배열로 리턴
		Week[] days = Week.values();
		for(Week day : days){//향상된 for문 사용
			System.out.println(day);
		}
	}
}
