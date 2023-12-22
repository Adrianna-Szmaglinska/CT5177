package assignment_8;

import java.io.Serializable;

public class Animal implements Comparable<Animal>, Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
    private String breed;
    private int size;

    public Animal() {}

    public Animal(String name, String breed, int size) {
        this.name = name;
        this.breed = breed;
        this.size = size;
    }
    
    public int compareTo(Animal a) {
        return name.compareTo(a.getName());
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
    
    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
    	return "Animal: " +
                "Name = " + name + ", " +
                "breed = " + breed + ", " +
                "size = " + size;
    }
}