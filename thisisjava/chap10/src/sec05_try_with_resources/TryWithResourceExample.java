package sec05_try_with_resources;

public class TryWithResourceExample {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			// 오류불러일으키기
			throw new Exception();
			//오류가 발생하자마자 자동으로 close()메소드 실행.
		} catch (Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}
	}

}
