package sec05_try_with_resources;
//Autocloseable ���� Ŭ����
public class FileInputStream implements AutoCloseable{
	
	private String file;
	
	public FileInputStream(String file){
		this.file = file;
		
	}
	
	
	@Override
	public void close() throws Exception {
		System.out.println("�� �ݽ��ϴ�.");
		
	}

}
