package sec07.exam04_array_management;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation){
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accmulateRotation;
		if(accmulateRotation < maxRotation){
			System.out.println(location + "KumhoTire ����: " + 
					(maxRotation - accmulateRotation) + "ȸ");
			return true;
		}else{
			System.out.println("***" + location + "KumhoTire ��ũ");
			return false;
		}
	
	}
	
}
