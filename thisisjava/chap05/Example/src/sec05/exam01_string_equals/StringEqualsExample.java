package sec05.exam01_string_equals;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVal1 = "신민철";
		String strVal2 = "신민철";
		
		if(strVal1 == strVal2){
			System.out.println("strVal1과 strVal2는 참조가 같음");
		}else{
			System.out.println("strVal1과 strVal2는 참조가 다름");
		}

		String strVal3 = new String("신민철");//new연산자를 사용하여 새로운 String 객체 생성
		String strVal4 = new String("신민철");
		
		if(strVal3 == strVal4){
			System.out.println("strVal3과 strVal4는 참조가 같음");
		}else{
			System.out.println("strVal3과 strVal4는 참조가 다름");
		}

		if(strVal3.equals(strVal4)){
		//equals()는 참조값이 같은지 비교하는게 아니라 문자가 같은지 비교하는 메소드
			System.out.println("strVal3과 strVal4는 문자열이 같음");
		}
	}

}
