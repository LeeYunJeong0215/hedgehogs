package sec02.exam01_inheritance;
//자식클래스
//자식클래스 extends 부모클래스
public class DmbCellPhone extends CellPhone {
	
	int channel;
	
	//생성자
	DmbCellPhone(String model, String color, int channel){
		//부모클래스에서 model, color 필드를 물려받아 사용
		//default로 접근제한자가 설정되어 있으므로(기본이 default니까) 같은 패키지내에서는 상속 가능.
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	//메소드
	void turnOnDmb(){
		System.out.println("채녈" + channel + "번 DMB 방송 수신을 시작합니다");
	}
	void changeChannelDmb(int channel){
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다");
	}
	void turnOffDmb(){
		System.out.println("채녈" + channel + "번 DMB 방송 수신을 종료합니다");
	}
}
