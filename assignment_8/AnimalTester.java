package assignment_8;

import java.io.*;
import java.util.*;

public class AnimalTester {
    public static void main(String[] args) {
        List<Animal> animalList = new LinkedList<>();
        
        // Create instances of Dog and Cat
        Animal dog1 = new Dog("Buddy", "Labrador", 50);
        Animal dog2 = new Dog("Simon", "Jack Russell", 20);
        Animal cat1 = new Cat("Whiskers", "Siamese", 10);
        Animal cat2 = new Cat("Marbels", "Orange", 12);

        // Populate the linked list
        animalList.add(dog1);
        animalList.add(dog2);
        animalList.add(cat1);
        animalList.add(cat2);

        // Display the contents of the list
        System.out.println("----------------Original list------------------------\n");
        for (Animal animal:animalList) {
        	System.out.println(animal.toString());
        }

        // Sort the list by name
        System.out.println("\n----------------Ordered by name----------------------\n");
        Collections.sort(animalList);
        for (Animal animal:animalList) {
        	System.out.println(animal.toString());
        }

        // Sort the list by breed using Comparator
        System.out.println("\n----------------Ordered by breed---------------------\n");
        Collections.sort(animalList, new BreedComparator());
        for (Animal animal:animalList) {
        	System.out.println(animal.toString());
        }

        // Sort the list by size using another Comparator
        System.out.println("\n----------------Ordered by size----------------------\n");
        Collections.sort(animalList, new SizeComparator());
        for (Animal animal:animalList) {
        	System.out.println(animal.toString());
        }

        // Serialize the list
        serializeList(animalList, "animalList.ser");

        // Deserialize and display the list
        List<Animal> deserializedList = deserializeList();
        System.out.println("\n----------------Deserialized list-------------------\n");
        displayList(deserializedList);
    }

    // Helper method to display the contents of the list
    private static void displayList(List<Animal> list) {
        for (Animal animal : list) {
            System.out.println(animal);
        }
    }

 // Helper method to serialize the list
    private static void serializeList(List<Animal> list, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Helper method to deserialize the list
    @SuppressWarnings("unchecked")
	private static List<Animal> deserializeList() {
        List<Animal> deserializedList = new LinkedList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("animalList.ser"))) {
            deserializedList = (List<Animal>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return deserializedList;
    }

    // Inner class for comparing by breed
    static class BreedComparator implements Comparator<Animal> {
        @Override
        public int compare(Animal a1, Animal a2) {
            return a1.getBreed().compareTo(a2.getBreed());
        }
    }

    // Inner class for comparing by size
    static class SizeComparator implements Comparator<Animal> {
        @Override
        public int compare(Animal a1, Animal a2) {
            return Integer.compare(a1.getSize(), a2.getSize());
        }
    }
}
