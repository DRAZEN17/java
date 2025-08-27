import java.util.Scanner;
public class Third {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "y"; 

        while (input.equalsIgnoreCase("y")) {
            System.out.println("it continues.");

            System.out.print("Do you want to continue? (y or n): ");
            input = scanner.nextLine();
        }

        System.out.println("it ended.");
        scanner.close();
    }
}
