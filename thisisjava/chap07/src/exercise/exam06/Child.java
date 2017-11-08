package exercise.exam06;

public class Child extends Parent{
	private String name;
	
	public Child(){
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child(String name){
		//super(); 1번(컴파일러시 자동생성, 부모호출)
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
