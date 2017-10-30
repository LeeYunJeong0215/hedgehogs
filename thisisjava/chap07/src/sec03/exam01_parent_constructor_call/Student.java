package sec03.exam01_parent_constructor_call;

public class Student extends People {
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo){
		//super(); 부모생성자에 매개변수가 2개 있으므로 오류발생.
		super(name, ssn);//super는 제일 첫줄에 써줘야 함.
		this.studentNo = studentNo;
		System.out.println("자식 객체 생성");
		
	}
}
