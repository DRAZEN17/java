package Assignment;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
           System.out.println("enter birth year");
          int widh = scanner.nextInt();

           int lengt = 2025; 
          int totl = lengt - widh;
          System.out.println(" ur age is   " + totl);
         scanner.close();
    }
}
