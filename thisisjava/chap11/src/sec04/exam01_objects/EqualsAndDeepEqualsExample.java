package sec04.exam01_objects;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsExample {
	public static void main(String[] args){
	Integer o1 = 1000;
	Integer o2 = 1000;
	
	//equals()�� Objects.equals(object1, object2)�� ��� ����.
	//Objects.equals(object1, object2)�� ���� ������ equals()��
	//�ٸ��� ���� �������� �ʰ� ��������� �� �ٲ� �� �ֱ� ����
	System.out.println(Objects.equals(o1, o2));
	System.out.println(o1.equals(o2));
	System.out.println(Objects.equals(o1, null));
	System.out.println(Objects.equals(null, o2));
	System.out.println(Objects.equals(null, null));
	
	//Objects.deepEquals()�� �迭�� �ƴ϶�� equals()�� Objects.equals()�� ����
	System.out.println(Objects.deepEquals(o1, o2));
	System.out.println("------------------------");
	Integer[] arr1 = {1, 2};
	Integer[] arr2 = {1, 2};
	
	//������ü�̹Ƿ� equals������ false�� ����.
	System.out.println(Objects.equals(arr1, arr2));
	//Objects.deepEquals������ ��ü�� ������ �޶� �׸��� ��� �����Ƿ� true�� ����.
	System.out.println(Objects.deepEquals(arr1, arr2));
	System.out.println(Arrays.deepEquals(arr1, arr2));
	System.out.println(Objects.deepEquals(null, arr2));
	System.out.println(Objects.deepEquals(arr1, null));
	System.out.println(Objects.deepEquals(null, null));
	
	}
}
