package sec03.exam04_outtercalss_ref;
//��ø Ŭ�������� �ٱ� Ŭ���� ���� ���
public class Outter {
	String field = "Outter-field";
	void method(){
		System.out.println("Outter-field");
	}
	//��� Ŭ����
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
