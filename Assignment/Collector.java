import java.util.Scanner;

public class Collector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String[] userDetails = new String[4];

    
        System.out.print("Enter your first name: ");
        userDetails[0] = scanner.nextLine();

        System.out.print("Enter your second name: ");
        userDetails[1] = scanner.nextLine();

        System.out.print("Enter your month of birth: ");
        userDetails[2] = scanner.nextLine();

        System.out.print("Are you married? (yes/no): ");
        userDetails[3] = scanner.nextLine();


        System.out.println("\nStored User Details:");
        for (String detail : userDetails) {
            System.out.println(detail);
        }

        scanner.close();
    }
}