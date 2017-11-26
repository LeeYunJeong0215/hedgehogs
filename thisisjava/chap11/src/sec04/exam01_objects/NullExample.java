package sec04.exam01_objects;

import java.util.Objects;

public class NullExample {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
		System.out.println(Objects.isNull(str1));
		System.out.println(Objects.isNull(str2));
		System.out.println("-------------------------------");
		System.out.println(Objects.nonNull(str1));
		System.out.println(Objects.nonNull(str2));
		System.out.println("-------------------------------");
		System.out.println(Objects.requireNonNull(str1));
		//System.out.println(Objects.requireNonNull(str2)); 
		//java.lang.NullPointerException 발생.
		
		//NullPointerException 예외처리
		try{
			String name = Objects.requireNonNull(str2);
		}catch(NullPointerException e){
			System.out.println(e.getMessage()); //null로 출력값 나옴.
		}
		System.out.println("-------------------------------");
		//예외메시지 지정.
		try{
			String name = Objects.requireNonNull(str2, "이름이 없습니다");
		}catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
		System.out.println("-------------------------------");
		//람다식으로 예외메시지 지정
		try{
			String name = Objects.requireNonNull(str2, ()->"이름이 없3다");
		}catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
		System.out.println("-------------------------------");
	}

}
