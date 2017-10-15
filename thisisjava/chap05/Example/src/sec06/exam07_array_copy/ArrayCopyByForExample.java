package sec06.exam07_array_copy;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		//for문을 이용한 배열복사
		
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		//복사
		for(int i=0; i<oldIntArray.length; i++){
			newIntArray[i] = oldIntArray[i];
		}
		//출력해서 확인(복사되고 남은 영역은 초기값이 들어가므로 0으로 출력됨)
		for(int i=0; i<newIntArray.length; i++){
			System.out.print(newIntArray[i] + ", ");
		}
	}

}
