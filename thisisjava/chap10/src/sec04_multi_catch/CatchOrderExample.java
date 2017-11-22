package sec04_multi_catch;

public class CatchOrderExample {

	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);

			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		//실행 범위가 더 큰 오류를 위에 설정하면 오류 발생
		//} catch (Exception e) {
		//	System.out.println("실행에 문제가 있습니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개 값의 수가 부족합니다.");
		} catch (Exception e) {
			System.out.println("실행에 문제가 있습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}

	}

}
