package sec14.exam01_getter_setter;

public class Car {
	//private 접근제한자 사용으로 객체 외부에서 데이터로 직접 접근 방지
	private int speed;
	private boolean stop;
	
	//이클립스 자동 getter,setter생성 방법 : Source->Generate Getters and Setters
	//getter() : private로 지정한 필드를 읽을 수만 있게 설정해주는 메소드 
	//boolean타입 이외의 타입 getter()메소드( 
	public int getSpeed(){
		return speed;
	}
	//boolean타입의 getter()메소드
	public boolean isStop(){
		return stop;
	}
	
	//setter()메소드 : 매개변수로 받은 필드의 값이 유효한 값인지 검사할 때 주로 쓰는 메소드
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
