package sec08.exam02_abstract_method;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		System.out.println("---------------------------");
		
		//부모 타입 변수에 자식클래스인 Dog, Cat 객체를 생성하여
		//추상메소드를 호출했을때는 각 자식클래스에 오버라이딩된 메소드가 호출됨.
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		
		System.out.println("---------------------------");
		
		animalSound(new Dog());
		animalSound(new Cat());
	}
	public static void animalSound(Animal animal){
		//매개변수가 부모타입 변수이므로 자식클래스의 객체 대입시 자동타입변환
		animal.sound();
	}

}
