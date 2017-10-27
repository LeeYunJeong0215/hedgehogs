package sec15.exam01_annotation;

import java.lang.reflect.*;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		//Service 클래스로부터 메소드 정보를 얻음.
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		//Method객체를 하나씩 처리
		for(Method method: declaredMethods){
			if(method.isAnnotationPresent(PrintAnnotation.class)){
				PrintAnnotation printAnnotation =
						method.getAnnotation(PrintAnnotation.class);
				/*System.out.println(method.getName() + ": ");
				System.out.println("value=" + printAnnotation.value());
				System.out.println("number=" + printAnnotation.number());
				System.out.println();*/
				//메소드 이름 출력
				System.out.println("[" + method.getName() + "]");
				//구분선 출력
				for(int i=0; i<printAnnotation.number(); i++){
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				//메소드호출
				try {
					method.invoke(new Service());
				} catch (Exception e) {
					
				}
				System.out.println();
				
			}
			
		}

	}

}
