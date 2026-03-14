import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] marks = new int[5];
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 → Add student marks");
            System.out.println("2 → Display highest mark");
            System.out.println("3 → Display average marks");
            System.out.println("4 → Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter marks of 5 students:");
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Student " + (i + 1) + " marks: ");
                        marks[i] = input.nextInt();
                    }
                    break;

                case 2:
                    int highest = marks[0];
                    for (int i = 1; i < 5; i++) {
                        if (marks[i] > highest) {
                            highest = marks[i];
                        }
                    }
                    System.out.println("Highest Mark: " + highest);
                    break;

                case 3:
                    int sum = 0;
                    for (int i = 0; i < 5; i++) {
                        sum += marks[i];
                    }
                    double average = sum / 5.0;
                    System.out.println("Average Marks: " + average);
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

    }
}
