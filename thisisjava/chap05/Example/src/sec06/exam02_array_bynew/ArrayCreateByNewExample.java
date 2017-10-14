package sec06.exam02_array_bynew;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		//new 연산자로 배열 생성
		int[] arr1 = new int[3]; //타입[] 변수 = new 타입[길이], 길이는 저장할 수 있는 값의 수
		for (int i=0; i<3; i++){//마지막 인덱스 = 길이 - 1
			System.out.println("arr1[" + i + "] : " + arr1[i] );
		}
		System.out.println();
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for (int i=0; i<3; i++){
			System.out.println("arr1[" + i + "] : " + arr1[i] );
		}
		System.out.println();
		
		double[] arr2 = new double[3];
		for (int i=0; i<3; i++){//마지막 인덱스 = 길이 - 1
			System.out.println("arr2[" + i + "] : " + arr2[i] );
		}
		System.out.println();
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for (int i=0; i<3; i++){//마지막 인덱스 = 길이 - 1
			System.out.println("arr2[" + i + "] : " + arr2[i] );
		}
		System.out.println();
		
		String[] arr3 = new String[3];
		for (int i=0; i<3; i++){//마지막 인덱스 = 길이 - 1
			System.out.println("arr3[" + i + "] : " + arr3[i] );
		}
		System.out.println();
		
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for (int i=0; i<3; i++){//마지막 인덱스 = 길이 - 1
			System.out.println("arr3[" + i + "] : " + arr3[i] );
		}
		System.out.println();
		
		
		
		
		
		
	}

} 
