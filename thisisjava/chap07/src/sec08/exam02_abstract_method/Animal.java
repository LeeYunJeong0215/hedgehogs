package sec08.exam02_abstract_method;

//추상클래스(abstract class)
public abstract class Animal {
	public String kind;
	
	public void breathe(){
		System.out.println("숨을 쉽니다.");
	}
	//추상메소드
	public abstract void sound();
}
