package sec10.exam03_static_be_careful;

public class Car {
	int speed;
	
	void run(){
		System.out.println(speed + "km/h���� �޸��ϴ�");
	}
	
	public static void main(String[] args){
		//�����߻�(main()�� static���� ���� �޼ҵ��̹Ƿ�
		//�ν��Ͻ� ����� ����Ϸ��� new �����ڷ� ��ü�� �����ϰ� ����ؾ� ��.
		/*speed = 60;
		run();*/
		
		Car myCar = new Car();
		
		myCar.speed = 60;
		myCar.run();
	}
}
