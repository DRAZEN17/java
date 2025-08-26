import java.util.Scanner;

public class Control {
    public static void main(String[] args) {
       Scanner newscanner = new Scanner(System.in);
         System.out.println("wats ur height");
       float height = newscanner.nextFloat();
       if(height < 6.0){
         System.out.println("ur tall");
       }
       else if(height > 3.5){
        System.out.println("ur average");
       }
       else{
        System.out.println("ur short");
       }
        newscanner.close();
    }
}
