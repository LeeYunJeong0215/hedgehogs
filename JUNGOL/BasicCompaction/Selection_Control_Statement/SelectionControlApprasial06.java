package Selection_Control_Statement;

import java.util.Scanner;

public class SelectionControlApprasial06 {

	public static void main(String[] args) {
/* ���ڴ� 'M' ���ڴ� 'F'�� ��Ÿ����� �ϰ� 18�� �̻��� �����̶�� ����.
    ����('M', 'F')�� ���̸� �Է¹޾� "MAN"(���γ���), "WOMAN"(���ο���), 
   "BOY"(�̼��Ⳳ��), "GIRL"(�̼��⿩��)�� �����Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�   [Copy]
F 15
���   [Copy]
GIRL
 */

		Scanner scanner = new Scanner(System.in);
		
		//String�Է½� .nextLine()�� �� �� �Է� �޴� ���̹Ƿ� ����� �ٷ� �Է� �������� .next���
		
		//Scanner�� ���� �ڷ������� �ִ°� ���ٴ� ��α׸� ���� 
		//���ε��� �־���ôµ� �ȳ���..�ֱ׷����� �𸣰ڴ�.
		/*Scanner scanner1= new Scanner(System.in);
		Scanner scanner2= new Scanner(System.in);
		String gender = scanner1.next();
		int age = scanner2.nextInt();*/
		
		String gender = scanner.next();
		int age = scanner.nextInt();
		
		//���ڿ� �񱳴� .equals()!!!!!!!
		if(gender.equals("F") && age >= 18){
			System.out.println("WOMAN");
		}else if(gender.equals("F") && age < 18){
			System.out.println("GIRL");
		}else if(gender.equals("M") && age >= 18){
			System.out.println("MAN");
		}else if(gender.equals("M") && age < 18){
			System.out.println("BOY");
		}
		scanner.close();
		
	}

}
