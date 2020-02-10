
public class Animal 
{
	public Animal() {
		System.out.println("Animal shouts");	
	}
	public void shout() {
		System.out.println("shout....shout....shout");
	}
	
	public static void main(String[] args) {
		Animal a = new Animal();
		a.shout();
		Cat c = new Cat();
		c.shout();
		Dog d = new Dog();
		d.shout();
		Horse h = new Horse();
		h.shout();
	}
}
