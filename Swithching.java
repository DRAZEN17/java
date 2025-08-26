import java.util.Scanner;

public class Swithching {
    public static void main(String[] args) {
        /*
         * char input : A,B,C or D
         * if input is A then print "perfect"
         * if input is B then print "very good"
         * if input is C then print "good"
         * if input is D then print "poor"
         *  finally if  is E then print " very poor"
         */
        System.out.println("Enter your grade (A, B, C, D, E):");
        Scanner scanner = new Scanner(System.in);
        char grade = scanner.next().charAt(0);

        // if (grade == 'A') {
        //     System.out.println("perfect");
        // } else if (grade == 'B') {
        //     System.out.println("very good");
        // } else if (grade == 'C') {
        //     System.out.println("good");
        // } else if (grade == 'D') {
        //     System.out.println("poor");
        // } else if (grade == 'E') {
        //     System.out.println("very poor");
        // } else {
        //     System.out.println("Invalid input");
        // }

        //Switch
        switch (grade) {
            case 'A' -> System.out.println("perfect");
            case 'B' -> System.out.println("very good");
            case 'C' -> System.out.println("good");
            case 'D' -> System.out.println("poor");
            case 'E' -> System.out.println("very poor");
            default -> System.out.println("Invalid input");
        }
         scanner.close();
    }
}

