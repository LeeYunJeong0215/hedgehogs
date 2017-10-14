package sec06.exam05_array_in_array;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		//2차원 배열
		int[][] mathScores = new int[2][3];
		
		for(int i=0; i<mathScores.length; i++){
			for(int j=0; j<mathScores[i].length; j++){
				System.out.println("mathScores["+ i +"][" + j + "] : " + mathScores[i][j]);
			
			}
		}
		System.out.println();
		
		int[][] englishScores = new int[2][];//2차 길이를 처음부터 주지 않았을 때
		
		//int[0][] enlgishScores = new int[3]; 내가 생각한 코드(오류)
		englishScores[0] = new int[3];
		englishScores[1] = new int[2];
		for(int i=0; i<englishScores.length; i++){
			for(int j=0; j<englishScores[i].length; j++){
				System.out.println("englishScores["+ i +"][" + j + "] : " + englishScores[i][j]);
			
			}
		}
		System.out.println();
		
		//오류발생 코드
		//int[][] javaScores = new int[][]; 생성시 행열 모두의 값을 주지 않으면 오류발생
		//int[][] javaScores = new int[][2]; 생성시 행의 값을 주지 않으면 오류		
		
		int[][] javaScores = {{95, 80},{92,96,80}};
		
		for(int i=0; i<javaScores.length; i++){
			for(int j=0; j<javaScores[i].length; j++){
				System.out.println("javaScores"+ i +"][" + j + "] : " + javaScores[i][j]);
			
			}
		}
		System.out.println();
		
		
		
		
		
	}
	
}
