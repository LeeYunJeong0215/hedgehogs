package exercise.exam06;

public class Child extends Parent{
	private String name;
	
	public Child(){
		this("ȫ�浿");
		System.out.println("Child() call");
	}
	
	public Child(String name){
		//super(); 1��(�����Ϸ��� �ڵ�����, �θ�ȣ��)
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
