import java.util.Arrays;
import java.util.Scanner;

// Generic class to hold a variable number of elements of a generic type
class GenericMax<T extends Comparable<T>> {
    private T[] elements;

    public GenericMax(T... elements) {
        this.elements = elements;
    }

    public T findMaximum() {
        return findMaximum(elements);
    }


    public T findMaximum(T... elements) {
            T max = elements[0];
            for (T value : elements) {
                if (value.compareTo(max) > 0) {
                    max = value;
                }
            }
            return max;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Strings
        // we dont need try catch  for strings because empty string is also consider as element in this case
        System.out.println("Enter strings separated by space ");
        try{
        String line = sc.nextLine();
        String[] strings = line.split(" ");
        GenericMax<String> stringMax = new GenericMax<>(strings);
        System.out.println("Max String: " + stringMax.findMaximum());
        }
        catch (Exception e){
            System.out.println("Enter Some Strings");
        }

        // Integers
        System.out.println("\nEnter integers separated by space:");
        try {
            String line = sc.nextLine();
            String[] intStrings = line.split(" ");
            Integer[] integers = new Integer[intStrings.length];
            for (int i = 0; i < intStrings.length; i++) {
                integers[i] = Integer.parseInt(intStrings[i]);
            }
            GenericMax<Integer> intMax = new GenericMax<>(integers);
            System.out.println("Max Integer: " + intMax.findMaximum());
        }
        catch (Exception e){
            System.out.println("Error handling Please Enter Some Integers");
        }

        // Floats
        System.out.println("\nEnter floats separated by space:");
        try {
            String line = sc.nextLine();
            String[] floatStrings = line.split(" ");
            Float[] floats = new Float[floatStrings.length];
            for (int i = 0; i < floatStrings.length; i++) {
                floats[i] = Float.parseFloat(floatStrings[i]);
            }
            GenericMax<Float> floatMax = new GenericMax<>(floats);
            System.out.println("Max Float: " + floatMax.findMaximum());
        }
        catch (Exception e){
            System.out.println("Error Handling Please Enter Float Numbers");
        }
        sc.close();
    }
}
