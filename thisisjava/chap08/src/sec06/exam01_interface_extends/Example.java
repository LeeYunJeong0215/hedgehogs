package sec06.exam01_interface_extends;

public class Example {
	public static void main(String[] args){
		
		ImplementationC impl = new ImplementationC();
		
		//InterfaceA ������ methodA�� ȣ�� ����
		InterfaceA ia = impl;
		ia.methodA();
		//���� �߻�
		//ia.methodB();
		//ia.methodC();
		System.out.println();
		
		//InterfaceB ������ methodB�� ȣ�� ����
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		//InterfaceA�� InterfaceB�� ��ӹ��� InterfaceC��
		//methodA,B,C ��� ȣ�� ����.
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
		
		
	}
}
