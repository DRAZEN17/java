import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalAge = 0;
        int validEntries = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Entry " + i + ":");

            // Ask for name
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            // Ask for age with validation
            int age = -1;
            while (true) {
                System.out.print("Enter your age: ");
                String ageInput = scanner.nextLine();
                try {
                    age = Integer.parseInt(ageInput);
                    if (age < 0) {
                        System.out.println("Age cannot be negative. Try again.");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid age. Please enter a number.");
                }
            }

            totalAge += age;
            validEntries++;
            System.out.println("Hello " + name + ", age recorded: " + age + "\n");
        }

        // Calculate and display average
        double averageAge = (double) totalAge / validEntries;
        System.out.println("Average age of group: " + averageAge);

        scanner.close();
    }
}