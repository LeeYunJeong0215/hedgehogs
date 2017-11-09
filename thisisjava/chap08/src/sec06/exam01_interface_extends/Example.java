package sec06.exam01_interface_extends;

public class Example {
	public static void main(String[] args){
		
		ImplementationC impl = new ImplementationC();
		
		//InterfaceA 변수는 methodA만 호출 가능
		InterfaceA ia = impl;
		ia.methodA();
		//오류 발생
		//ia.methodB();
		//ia.methodC();
		System.out.println();
		
		//InterfaceB 변수는 methodB만 호출 가능
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		//InterfaceA와 InterfaceB를 상속받은 InterfaceC는
		//methodA,B,C 모두 호출 가능.
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
		
		
	}
}
