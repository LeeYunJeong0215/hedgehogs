package sec02.exam01_inheritance;
//�ڽ�Ŭ����
//�ڽ�Ŭ���� extends �θ�Ŭ����
public class DmbCellPhone extends CellPhone {
	
	int channel;
	
	//������
	DmbCellPhone(String model, String color, int channel){
		//�θ�Ŭ�������� model, color �ʵ带 �����޾� ���
		//default�� ���������ڰ� �����Ǿ� �����Ƿ�(�⺻�� default�ϱ�) ���� ��Ű���������� ��� ����.
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	//�޼ҵ�
	void turnOnDmb(){
		System.out.println("ä��" + channel + "�� DMB ��� ������ �����մϴ�");
	}
	void changeChannelDmb(int channel){
		this.channel = channel;
		System.out.println("ä�� " + channel + "������ �ٲߴϴ�");
	}
	void turnOffDmb(){
		System.out.println("ä��" + channel + "�� DMB ��� ������ �����մϴ�");
	}
}
