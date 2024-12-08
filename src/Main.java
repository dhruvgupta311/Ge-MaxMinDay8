import java.util.Scanner;

class MaxNumber {
    public float testMax(float num1, float num2, float num3) {
        float max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        float num2 = scanner.nextFloat();

        System.out.print("Enter the third number: ");
        float num3 = scanner.nextFloat();

        MaxNumber maxObj = new MaxNumber();
        float maxi = maxObj.testMax(num1, num2, num3);
        System.out.println("Maximum number is " + maxi);

        scanner.close();
    }
}
