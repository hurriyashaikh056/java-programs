import java.util.Scanner;

public class Squareroot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = input.nextDouble();

        double result = Math.sqrt(num);

        System.out.println("Square root of " + num + " is: " + result);
    }
}
