package Selection_Control_Statement;

import java.util.Scanner;

public class SelectionControlApprasial04 {

	public static void main(String[] args) {
/* 복싱체급은 몸무게가 50.80kg 이하를 Flyweight 61.23kg 이하를 Lightweight, 
 * 72.57kg 이하를 Middleweight, 88.45kg 이하를 Cruiserweight, 
 * 88.45kg 초과를 Heavyweight라고 하자.
 몸무게를 입력받아 체급을 출력하는 프로그램을 작성하시오.
   
입력   [Copy]
87.3
출력   [Copy]
Cruiserweight
*/ 

		Scanner scanner = new Scanner(System.in);
		
		double weight = scanner.nextDouble();
		
		if(weight > 88.45){
			System.out.println("Heavyweight");
		}else if(weight <= 88.45 && weight > 72.57){
			System.out.println("Cruiserweight");
		}else if(weight <= 72.57 && weight > 61.23){
			System.out.println("Middleweight");
		}else if(weight <= 61.23 && weight > 50.80){
			System.out.println("Lightweight");
		}else{
			System.out.println("Flyweight");
		}
		scanner.close();
	}

}
