import java.util.Scanner;

public class Sixth {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int correctNumber = 7; 
        int guess = 0;

        while (guess != correctNumber) {
            System.out.print("Pick a number from 1 to 10: ");
            guess = scanner.nextInt();

            if (guess != correctNumber) {
                System.out.println("Wrong number!");
            }
        }

        System.out.println("Correct!");
        scanner.close();
    }
}
