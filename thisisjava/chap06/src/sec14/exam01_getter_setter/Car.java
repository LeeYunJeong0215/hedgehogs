package sec14.exam01_getter_setter;

public class Car {
	//private ���������� ������� ��ü �ܺο��� �����ͷ� ���� ���� ����
	private int speed;
	private boolean stop;
	
	//��Ŭ���� �ڵ� getter,setter���� ��� : Source->Generate Getters and Setters
	//getter() : private�� ������ �ʵ带 ���� ���� �ְ� �������ִ� �޼ҵ� 
	//booleanŸ�� �̿��� Ÿ�� getter()�޼ҵ�( 
	public int getSpeed(){
		return speed;
	}
	//booleanŸ���� getter()�޼ҵ�
	public boolean isStop(){
		return stop;
	}
	
	//setter()�޼ҵ� : �Ű������� ���� �ʵ��� ���� ��ȿ�� ������ �˻��� �� �ַ� ���� �޼ҵ�
	public void setSpeed(int speed){
		this.speed = speed;
		if(speed < 0){
			this.speed = 0;
			return;
		}else{
			this.speed = speed;
		}
	}
	public void setStop(boolean stop){
		this.stop = stop;
		this.speed = 0;
	
	}
}
