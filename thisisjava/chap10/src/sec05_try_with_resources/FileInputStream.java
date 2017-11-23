package sec05_try_with_resources;
//Autocloseable 구현 클래스
public class FileInputStream implements AutoCloseable{
	
	private String file;
	
	public FileInputStream(String file){
		this.file = file;
		
	}
	
	
	@Override
	public void close() throws Exception {
		System.out.println("을 닫습니다.");
		
	}

}
