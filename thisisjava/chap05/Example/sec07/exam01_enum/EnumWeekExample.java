package sec07.exam01_enum;

import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args){
		//����Ÿ���� �̿��� ��ǻ�� �ð��� �ҷ��ͼ� ���� ǥ���ϱ�
		//����Ÿ�Ժ��� ����
		Week today = null;
		//Calendar.getInstance()�޼ҵ�� ��¥�� �ð� ���
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);//(1~7 : ��~��)
		System.out.println(week);
		//����� ���ϰ��� ������� ���� ������ ���ڷ� ���
		//����Ÿ�Ժ����� ���Ż���� ����
		switch(week){
			case 1:
				today = Week.SUNDAY;
				break;
			case 2:
				today = Week.MONDAY;
				break;
			case 3:
				today = Week.TUSEDAY;
				break;
			case 4:
				today = Week.WEDNESDAY;
				break;
			case 5:
				today = Week.THURSDAY;
				break;
			case 6:
				today = Week.FRIDAY;
				break;
			case 7:
				today = Week.SATURDAY;
				break;
				
		}
		//���
		System.out.println("���� ���� : " + today);
		
		if(today == Week.SUNDAY){
			System.out.println("ī�信�� ���θ� �մϴ�");
		}else{
			System.out.println("���忡�� ���θ� �մϴ�");
		}
	}
}
