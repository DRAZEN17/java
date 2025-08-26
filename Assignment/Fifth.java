import java.util.Scanner;

public class Fifth {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;

        while (age <= 18) {
            System.out.print("Enter your age: ");
            age = scanner.nextInt();

            if (age <= 18) {
                System.out.println("You are a too young. Try again.");
            }
        }

        System.out.println("Welcome!");
        scanner.close();
    }
}
