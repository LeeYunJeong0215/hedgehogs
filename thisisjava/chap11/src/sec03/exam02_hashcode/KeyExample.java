package sec03.exam02_hashcode;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		//식별키 new key(1)로 홍길동을 저장
		hashMap.put(new Key(1), "홍길동");
		//식별키 new key(1)로 홍길동을 불러옴.
		//hashcode()를 오버라이딩 하지 않은 경우에는 값이 null로 출력됨.
		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}

}
