package chap04_Exercise;

public class Exercise04 {

	public static void main(String[] args) {
		// 2개의 주사위를 랜덤으로 굴린다
		// while과 Math.random()메소드를 이용한다
		// 눈의 합이 5가 아니면 주사위를 계속 던지고, 5가 되면 실행을 멈춘다
				boolean run = true;
		
		while(run) {
			int dice1 = (int) (Math.random() * 6) + 1;
			int dice2 = (int) (Math.random() * 6) + 1;
			System.out.println("(" + dice1 + "," + dice2 + ")");
			if(dice1 + dice2 == 5){
				run = false;
			}
		}

	}

}
