import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        String correctPassword = "Drax123"; 
        String input = "";

        while (!input.equals(correctPassword)) {
            System.out.print("Enter password: ");
            input = scanner.nextLine();

            if (!input.equals(correctPassword)) {
                System.out.println("Wrong password, try again.");
            }
        }

        System.out.println("Access granted!");
        scanner.close();
    }
}
