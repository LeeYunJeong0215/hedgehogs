package sec03.exam01_equals;

public class MemberExample {
	public static void main(String[] args){
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		//equals() 메소드를 오버라이딩 해주지 않았을 때는 obj1 == obj2와 동일
		//즉 객체의 번지를 비교하여 같은지 확인.
		/*if(obj1 == obj2){
			System.out.println("obj1과 obj2는 동등");
		}else{
			System.out.println("obj1과 obj2는 동등하지 않다");
		}
		*/
		if(obj1.equals(obj2)){
			System.out.println("obj1과 obj2는 동등");
		}else{
			System.out.println("obj1과 obj2는 동등하지 않다");
		}
		
		if(obj1.equals(obj3)){
			System.out.println("obj1과 obj3는 동등");
		}else{
			System.out.println("obj1과 obj3는 동등하지 않다");
		}
	}
}
