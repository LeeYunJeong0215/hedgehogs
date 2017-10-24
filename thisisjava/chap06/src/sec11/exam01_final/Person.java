package sec11.exam01_final;

public class Person {
	//final 필드 : 초기값을 주면 이후 수정이 불가능한 필드
	//초기값 주는 방법 2가지(1.필드선언시 2.생성자에서)
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name){
		this.ssn = ssn;
		this.name = name;
	}
}
