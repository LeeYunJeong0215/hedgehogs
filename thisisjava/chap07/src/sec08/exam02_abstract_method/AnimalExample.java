package sec08.exam02_abstract_method;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		System.out.println("---------------------------");
		
		//�θ� Ÿ�� ������ �ڽ�Ŭ������ Dog, Cat ��ü�� �����Ͽ�
		//�߻�޼ҵ带 ȣ���������� �� �ڽ�Ŭ������ �������̵��� �޼ҵ尡 ȣ���.
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
		//�Ű������� �θ�Ÿ�� �����̹Ƿ� �ڽ�Ŭ������ ��ü ���Խ� �ڵ�Ÿ�Ժ�ȯ
		animal.sound();
	}

}
