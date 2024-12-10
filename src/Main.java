import java.util.Scanner;

// Generic class to hold three variables of a generic type
class GenericMax<T extends Comparable<T>> {
    private T a, b, c;
    public GenericMax(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T testMaximum() {
        return testMaximum(a, b, c);
    }

    public static <T extends Comparable<T>> T testMaximum(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) max = b;
        if (c.compareTo(max) > 0) max = c;
        return max;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Strings
        System.out.print("Enter 3 strings: ");
        String s1 = sc.next(), s2 = sc.next(), s3 = sc.next();
        GenericMax<String> stringMax = new GenericMax<>(s1, s2, s3);
        System.out.println("Max String: " + stringMax.testMaximum());

        // Integers
        System.out.print("Enter 3 integers: ");
        Integer n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
        GenericMax<Integer> intMax = new GenericMax<>(n1, n2, n3);
        System.out.println("Max Integer: " + intMax.testMaximum());

        // Floats
        System.out.print("Enter 3 floats: ");
        Float f1 = sc.nextFloat(), f2 = sc.nextFloat(), f3 = sc.nextFloat();
        GenericMax<Float> floatMax = new GenericMax<>(f1, f2, f3);
        System.out.println("Max Float: " + floatMax.testMaximum());

        sc.close();
    }
}
