package sec07.exam04_array_management;

public class Tire {
	public int maxRotation; //�ִ�ȸ����(Ÿ�̾����)
	public int accmulateRotation; //����ȸ����
	public String location; //Ÿ�̾��� ��ġ
	
	//������
	public Tire(String location, int maxRotation){
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//�޼ҵ�
	public boolean roll(){
		++accmulateRotation;
		if(accmulateRotation < maxRotation){
			System.out.println(location + "Tire����: " + 
					(maxRotation - accmulateRotation) + "ȸ");
			return true;
		}else{
			System.out.println("***" + location + "Tire ��ũ");
			return false;
		}
	}

}
