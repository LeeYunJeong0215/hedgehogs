package sec07.exam06_casting;

public class ChildExample {

	public static void main(String[] args) {
		//자동타입변환
		Parent parent = new Child();
		
		//parent.field1 //오류발생 왜? 필드인데 리터럴이 없어서 그런듯.
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*불가능(Parent타입이므로 자식객체의 필드와 메소드 사용불가)
		parent.field2();
		parent.method3();
		*/
		
		//강제타입변환
		//부모타입을 자식타입으로 변환하여 자식클래스의 필드와 메소드 사용가능.
		Child child1 = (Child) new Parent();
		Child child2 = (Child) parent;
		
		
		child1.field2 = "yyy";
		child1.method3();
		child2.field2 = "yyy";
		child2.method3();
		
		//이렇게 하면 다 사용이 가능하군..
		child1.field1 = " ";
		child1.method1();
		child1.method2();
	}

}
