package sec06.exam07_array_copy;

public class ArrayCopyExample {

	public static void main(String[] args) {
		//System.arraycopy()로 배열복사
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		//System.arraycopy(복사할배열, 복사시작위치, 복사한것이 저장될 배열, 저장위치, 저장갯수);
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		//출력해서 확인
		for(int i=0; i<newStrArray.length; i++){
			System.out.print(newStrArray[i] + ", ");
		}
	}

}
