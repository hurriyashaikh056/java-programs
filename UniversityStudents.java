
import java.util.Scanner;

public class UniversityStudents {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter University Name: ");
        String university = input.nextLine();

        System.out.print("Enter total number of students: ");
        int totalStudents = input.nextInt();

        System.out.println("Even roll numbers in " + university + " are:");

        for (int roll = 1; roll <= totalStudents; roll++) {
            if (roll % 2 == 0) {
                System.out.println("Roll No: " + roll);
            }
        }
    }
}