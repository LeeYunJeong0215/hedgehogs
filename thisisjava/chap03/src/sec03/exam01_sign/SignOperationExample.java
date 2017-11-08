package sec03.exam01_sign;

public class SignOperationExample {

	public static void main(String[] args) {
	
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		
		System.out.println(result1); //부호유지
		System.out.println(result2);//부호바뀜
		
		short s = 100;
		//short result3 = -s;  컴파일에러, 부호연산자에 의한 값은 int인데 short에 저장하려고 했기 때문에
		int result3 = -s;
		System.out.println(result3);
	}

}
