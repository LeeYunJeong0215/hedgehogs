package sec11.exam01_final;

public class PersonExample {

	public static void main(String[] args) {
		Person person = new Person("123456 - 7890123", "개똥이");
		
		System.out.println(person.nation);
		System.out.println(person.ssn);
		System.out.println(person.name);
		
		//nation과 ssn은 final필드이므로 값 변경 불가,오류발생
		/*person.nation = "USA";
		person.ssn = "123456 - 3253613";*/
		
		//name필드는 final필드가 아니므로 변경 가능.
		person.name = "소똥이";
		System.out.println(person.name);
	}

}

