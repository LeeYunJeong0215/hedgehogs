package sec03.exam02_hashcode;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		//�ĺ�Ű new key(1)�� ȫ�浿�� ����
		hashMap.put(new Key(1), "ȫ�浿");
		//�ĺ�Ű new key(1)�� ȫ�浿�� �ҷ���.
		//hashcode()�� �������̵� ���� ���� ��쿡�� ���� null�� ��µ�.
		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}

}
