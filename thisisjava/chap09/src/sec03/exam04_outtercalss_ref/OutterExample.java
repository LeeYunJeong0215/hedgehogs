package sec03.exam04_outtercalss_ref;

public class OutterExample {
	public static void main(String[] args){
		Outter outter = new Outter();
		Outter.Nested nested = outter.new Nested();
		nested.print();
	}
}
