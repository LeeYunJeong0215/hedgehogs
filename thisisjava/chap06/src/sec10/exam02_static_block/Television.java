package sec10.exam02_static_block;

public class Television {
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	static int from1To10Sum;
	
	//�ձ��� �ҹ��ڷ�, static()�ƴ�, ��ȣ ����
	//���� �ʱ�ȭ ���
	static{
		
		//String info = company + " - " + model; String ���� �ʿ�x
		info = company + " - " + model;
		
		int sum = 0;
		for(int i=1; i<=10; i++){
			sum += i;
		}
		from1To10Sum = sum;
	}
}
