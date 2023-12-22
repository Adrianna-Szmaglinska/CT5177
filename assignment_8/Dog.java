package assignment_8;

public class Dog extends Animal {
	private static final long serialVersionUID = 1L;

	public Dog(String name, String breed, int size) {
        super(name, breed, size);
    }

    public String sound() {
        return "Woof";
    }
}