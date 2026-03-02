import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        int guess = 0;
        int correct_guess = 220;

        while (guess != correct_guess) {
            System.out.println("guess the number:");
            Scanner sc = new Scanner(System.in);

            guess = sc.nextInt();
            if (guess > correct_guess) {
                System.out.println("number is too high");
            } else if (guess < correct_guess) {
                System.out.println("number is too low");
            }

            else {
                System.out.println("you have sucessfully guess the number");
            }

        }
        System.out.println("------  the  guess game has ended ------");
    }
}
