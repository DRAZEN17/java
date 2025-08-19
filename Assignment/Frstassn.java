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
        
        // int lenght = 12; 

        // int width = 5;

        // int area = lenght * width;
        // System.out.println(area);
        scanner.close();
}
}
