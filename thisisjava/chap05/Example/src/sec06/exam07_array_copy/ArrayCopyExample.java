package sec06.exam07_array_copy;

public class ArrayCopyExample {

	public static void main(String[] args) {
		//System.arraycopy()�� �迭����
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		//System.arraycopy(�����ҹ迭, ���������ġ, �����Ѱ��� ����� �迭, ������ġ, ���尹��);
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		//����ؼ� Ȯ��
		for(int i=0; i<newStrArray.length; i++){
			System.out.print(newStrArray[i] + ", ");
		}
	}

}
