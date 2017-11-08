package exercise.exam06;

public class Parent {
	public String nation;
	
	public Parent(){
		//super(); super와 this생성자는 같이 쓸 수 없다.
		this("대한민국");
		System.out.println("Parent() call");		
	}
	
	public Parent(String nation){
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
