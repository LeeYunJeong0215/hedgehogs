package sec07.exam04_array_management;

public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation){
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accmulateRotation;
		if(accmulateRotation < maxRotation){
			System.out.println(location + "HankookTire ����: " + 
					(maxRotation - accmulateRotation) + "ȸ");
			return true;
		}else{
			System.out.println("***" + location + "HankookTire ��ũ");
			return false;
		}
	
	}
	
}
