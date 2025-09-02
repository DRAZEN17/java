import java.util.Scanner;

public class Physical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String[] userInfo = new String[3];

        
        System.out.print("Enter your age: ");
        userInfo[0] = scanner.nextLine();

        
        System.out.print("Enter your phone number: ");
        userInfo[1] = scanner.nextLine();

        
        System.out.print("Enter number of hands: ");
        userInfo[2] = scanner.nextLine();

        
        System.out.println("\n Information:");
        System.out.println("Age: " + userInfo[0]);
        System.out.println("Phone Number: " + userInfo[1]);
        System.out.println("Number of Hands: " + userInfo[2]);

        scanner.close();
    }
}