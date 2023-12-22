package assignment_8;

public class Cat extends Animal {
	private static final long serialVersionUID = 1L;

    public Cat(String name, String breed, int size) {
        super(name, breed, size);
    }

    public String sound() {
        return "Meow";
    }
}