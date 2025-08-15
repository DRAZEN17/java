package Assignment;

import java.util.Scanner;

public class Frstassn {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
          System.out.println("enter age");
          int width = scanner.nextInt();

          int lenght = 2025; 
          int total = lenght - width;
          System.out.println(" ur birth month  is   " + total);
         
          System.out.println("**************");

          System.out.println("enter birth year");
          int widh = scanner.nextInt();

           int lengt = 2025; 
          int totl = lengt - widh;
          System.out.println(" ur age is   " + totl);
        
        
        // int lenght = 12; 

        // int width = 5;

        // int area = lenght * width;
        // System.out.println(area);
        scanner.close();
}
}
