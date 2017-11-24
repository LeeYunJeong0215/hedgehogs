package sec04.exam01_objects;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsExample {
	public static void main(String[] args){
	Integer o1 = 1000;
	Integer o2 = 1000;
	
	//equals()와 Objects.equals(object1, object2)는 사실 같음.
	//Objects.equals(object1, object2)를 쓰는 이유는 equals()와
	//다르게 값이 고정되지 않고 상대적으로 더 바꿀 수 있기 때문
	System.out.println(Objects.equals(o1, o2));
	System.out.println(o1.equals(o2));
	System.out.println(Objects.equals(o1, null));
	System.out.println(Objects.equals(null, o2));
	System.out.println(Objects.equals(null, null));
	
	//Objects.deepEquals()는 배열이 아니라면 equals()와 Objects.equals()와 동일
	System.out.println(Objects.deepEquals(o1, o2));
	System.out.println("------------------------");
	Integer[] arr1 = {1, 2};
	Integer[] arr2 = {1, 2};
	
	//참조객체이므로 equals에서는 false가 나옴.
	System.out.println(Objects.equals(arr1, arr2));
	//Objects.deepEquals에서는 객체의 참조는 달라도 항목값이 모두 같으므로 true가 나옴.
	System.out.println(Objects.deepEquals(arr1, arr2));
	System.out.println(Arrays.deepEquals(arr1, arr2));
	System.out.println(Objects.deepEquals(null, arr2));
	System.out.println(Objects.deepEquals(arr1, null));
	System.out.println(Objects.deepEquals(null, null));
	
	}
}
