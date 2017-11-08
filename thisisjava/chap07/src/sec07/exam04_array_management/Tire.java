package sec07.exam04_array_management;

public class Tire {
	public int maxRotation; //최대회전수(타이어수명)
	public int accmulateRotation; //누적회전수
	public String location; //타이어의 위치
	
	//생성자
	public Tire(String location, int maxRotation){
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메소드
	public boolean roll(){
		++accmulateRotation;
		if(accmulateRotation < maxRotation){
			System.out.println(location + "Tire수명: " + 
					(maxRotation - accmulateRotation) + "회");
			return true;
		}else{
			System.out.println("***" + location + "Tire 펑크");
			return false;
		}
	}

}
