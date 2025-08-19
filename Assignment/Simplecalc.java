package Assignment;
import java.util.Scanner;

public class Simplecalc {
  public static void main(String[] args) {
    Scanner newscanner = new Scanner(System.in);

        System.out.print("What is your first number: ");
        float num1 = newscanner.nextFloat();

        System.out.print("What is your second number: ");
        float num2 = newscanner.nextFloat();

        System.out.print("Choose an operation (sum, difference, product, quotient): ");
        String op = newscanner.next();

        if (op.equalsIgnoreCase("sum")) {
            float sum = num1 + num2;
            System.out.println("The sum is: " + sum);
        } else if (op.equalsIgnoreCase("difference")) {
            float difference = num1 - num2;
            System.out.println("The difference is: " + difference);
        } else if (op.equalsIgnoreCase("product")) {
            float product = num1 * num2;
            System.out.println("The product is: " + product);
        } else if (op.equalsIgnoreCase("quotient")) {
            if (num2 != 0) {
                float quotient = num1 / num2;
                System.out.println("The quotient is: " + quotient);
            } else {
                System.out.println("Error: Division by zero!");
            }
        } else {
            System.out.println("Invalid operation. Please try again.");
        }

        newscanner.close();
  }

}
