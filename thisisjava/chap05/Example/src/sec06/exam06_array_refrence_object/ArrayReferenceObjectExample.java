package sec06.exam06_array_refrence_object;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		
		//같은 참조값
		strArray[0] = "java";
		strArray[1] = "java";
		//다른 참조값(new 생성자)
		strArray[2] = new String("java");
		//같은 참조인지(==)
		System.out.println(strArray[0]==strArray[1]);
		System.out.println(strArray[0]==strArray[2]);
		//같은 문자열인지(.equls())
		System.out.println(strArray[0].equals(strArray[2]));
	}

}
