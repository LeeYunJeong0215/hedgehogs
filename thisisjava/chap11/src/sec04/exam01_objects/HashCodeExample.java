package sec04.exam01_objects;

import java.util.Objects;

public class HashCodeExample {

	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
	
	static class Student{
		int sno;
		String name;
		
		public Student(int sno, String name){
			this.sno = sno;
			this.name = name;
		}
		//객체의 필드값이 동일하면 같은 해시코드가 리턴되도록 hashCode()를 오버라이딩
		@Override
		public int hashCode() {
			return Objects.hash(sno,  name);
		}
	}

}
