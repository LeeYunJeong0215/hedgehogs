package sec03.exam04_outtercalss_ref;
//중첩 클래스에서 바깥 클래스 참조 얻기
public class Outter {
	String field = "Outter-field";
	void method(){
		System.out.println("Outter-field");
	}
	//멤버 클래스
	class Nested{
		String field = "Nested-field";
		void method(){
			System.out.println("Nested-field");
		}
		void print(){
			System.out.println(this.field);//=nested.field
			this.method(); //=nested.method
			
			System.out.println(Outter.this.field); //=Outter.field
			Outter.this.method();//=Outter.method
		}
	}

}
