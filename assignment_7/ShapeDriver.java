package assignment_7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ShapeDriver {
    public static void main(String[] args) {
    	
        // Create a list of shapes (circles and rectangles)
        List<Shapes> shapesList = new ArrayList<>();
        shapesList.add(new Circle(5.0));
        shapesList.add(new Circle(3.0));
        shapesList.add(new Rectangle(4.0, 6.0));
        shapesList.add(new Rectangle(2.0, 8.0));

        // Calculate areas for each shape
        for (Shapes shape : shapesList) {
            shape.calculateArea();
        }

        // Find and print the largest shape
        Shapes largestShape = largestShape(shapesList);
        System.out.println("Largest Shape: " + "\n" + largestShape + "\n");

        // Serialization of the shapes list
        serializeList(shapesList, "shapes.ser");

        // Deserialization of the shapes list
        List<Shapes> deserializedList = deserializeList("shapes.ser");
        System.out.println("\nDeserialized List: " + formatShapesList(deserializedList));
    }

    // Method to find the largest shape in a list
    public static Shapes largestShape(List<Shapes> list) {
        Shapes largest = list.get(0);
        for (Shapes shape : list) {
            if (shape.compareShapes(largest) > 0) {
                largest = shape;
            }
        }
        return largest;
    }

    // Method to serialize a list of shapes to a file
    private static void serializeList(List<Shapes> list, String fileName) {
        try (FileOutputStream fileStream = new FileOutputStream(fileName);
             ObjectOutputStream os = new ObjectOutputStream(fileStream)) {
            os.writeObject(list);
            System.out.println("Serialization successful. File: " + fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to deserialize a list of shapes from a file
    @SuppressWarnings("unchecked")
    private static List<Shapes> deserializeList(String fileName) {
        List<Shapes> deserializedList = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            deserializedList = (List<Shapes>) ois.readObject();
            System.out.println("Deserialization successful. File: " + fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return deserializedList;
    }

    // Method to format the list of shapes
    private static String formatShapesList(List<Shapes> list) {
        StringBuilder formattedList = new StringBuilder("\n• ");
        for (int i = 0; i < list.size(); i++) {
            Shapes shape = list.get(i);
            formattedList.append(shape.toString());
            if (i < list.size() - 1) {
                formattedList.append("\n• ");
            }
        }
        formattedList.append("\n");
        return formattedList.toString();
    }
}


