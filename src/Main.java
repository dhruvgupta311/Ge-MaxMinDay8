import java.util.Scanner;

class MaxString {
    public String testMax(String str1, String str2, String str3) {
        String max = str1;
        if (str2.compareTo(max) > 0) {
            max = str2;
        }
        if (str3.compareTo(max) > 0) {
            max = str3;
        }
        return max;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        System.out.print("Enter the third string: ");
        String str3 = scanner.nextLine();

        MaxString maxObj = new MaxString();
        String maxString = maxObj.testMax(str1, str2, str3);
        System.out.println("Maximum string is: " + maxString);

        scanner.close();
    }
}
