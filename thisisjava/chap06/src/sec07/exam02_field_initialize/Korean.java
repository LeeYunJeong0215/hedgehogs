package sec07.exam02_field_initialize;

public class Korean {
	//필드 설정
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생성자(매개변수의 이름을 필드와 다르게 - 보통 이렇게 하지 않음)
	/*public Korean(String n, String s){
		name = n;
		ssn = s;
		
	}*/
	
	//생성자(매개변수의 이름과 필드이름을 같게)
	//변수이름과 필드이름이 같으면 생성자 내부에서 해당필드에 접근할 수 없다
	//왜냐하면 동일한 이름의 매개변수가 사용 우선순위가 높기 때문이다.
	//그래서 매개변수와 구분을 위해 필드 앞에 .this를 붙여준다(this.필드)
	public Korean(String name, String ssn){
		this.name = name;
		this.ssn = ssn;		
	}
}
