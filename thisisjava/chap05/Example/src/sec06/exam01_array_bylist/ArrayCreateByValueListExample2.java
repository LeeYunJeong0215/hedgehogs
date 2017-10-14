package sec06.exam01_array_bylist;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		//배열을 미리 생성한 후 new연산자를 사용해 값을 대입하기
		int[] scores;
		//scores = {83,90,87}; 이렇게 선언하면 오류 발생(배열을 미리 생성했기 때문에)
		scores = new int[] {83, 90, 87};
		int sum1 = 0;
		for(int i=0; i<3; i++){
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);
		
		//int sum2 = add({83, 90, 87});
		//에러발생, add메소드에 매개변수 int[] scores를 줌으로써 배열을 이미 생성했으므로
		//new 연산자를 이용해서 배열에 값을 줘야 하는 것.
		
		int sum2 = add(new int[]{83, 90, 87});
		System.out.println("총합 : " + sum2);
	}
	
	public static int add(int[] scores){
		int sum = 0;
		for(int i=0; i<3; i++){
			sum += scores[i];
		}
		return sum;
	}
}
