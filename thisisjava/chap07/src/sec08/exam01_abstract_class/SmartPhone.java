package sec08.exam01_abstract_class;

public class SmartPhone extends Phone {
	
	public SmartPhone(String owner){
		super(owner);		
	}
	public void InternetSearch(){
		System.out.println("인터넷 검색을 합니다");
	}
}
