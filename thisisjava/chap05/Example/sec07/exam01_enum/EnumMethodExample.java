package sec07.exam01_enum;

public class EnumMethodExample {

	public static void main(String[] args) {
		// ����Ÿ�� �޼ҵ� �ǽ�(Week.java)
		// name() : ���Ű�ü ���ڿ� ����
		Week today = Week.SUNDAY; // ���ź��� ���� �� ���Ż�� ����
		String name = today.name();
		System.out.println(name);

		// ordinal() : ���Ű�ü ���� ����
		int ordinal = today.ordinal();
		System.out.println(ordinal);

		// compareTo() : ���� �� ����
		Week today1 = Week.MONDAY;
		Week today2 = Week.WEDNESDAY;

		int result1 = today1.compareTo(today2);// 0-2
		System.out.println(result1);
		int result2 = today2.compareTo(today1);
		System.out.println(result2);

		// valueOf() : �Ű����� ���ڿ��� ������ ���ڿ��� ������ ���� ��ü(�ּ�?)����
		Week weekDay = Week.valueOf("SUNDAY");
		System.out.println(weekDay);//�ּҰ� �ƴ϶� ��ü�� ����
		if (weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
			System.out.println("�ָ��̱���");
		} else {
			System.out.println("�����̱���");
		}
		//values() : ����Ÿ���� ��� ���Ű�ü���� �迭�� ����
		Week[] days = Week.values();
		for(Week day : days){//���� for�� ���
			System.out.println(day);
		}
	}
}
