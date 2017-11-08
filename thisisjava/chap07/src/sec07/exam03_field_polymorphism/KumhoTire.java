package sec07.exam03_field_polymorphism;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation){
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accmulateRotation;
		if(accmulateRotation < maxRotation){
			System.out.println(location + "KumhoTire ¼ö¸í: " + 
					(maxRotation - accmulateRotation) + "È¸");
			return true;
		}else{
			System.out.println("***" + location + "KumhoTire ÆãÅ©");
			return false;
		}
	
	}
	
}
