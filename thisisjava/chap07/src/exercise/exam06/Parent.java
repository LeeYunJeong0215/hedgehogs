package exercise.exam06;

public class Parent {
	public String nation;
	
	public Parent(){
		//super(); super�� this�����ڴ� ���� �� �� ����.
		this("���ѹα�");
		System.out.println("Parent() call");		
	}
	
	public Parent(String nation){
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
