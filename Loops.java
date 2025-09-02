
public class Loops {

    public static void main(String[] args) {
        // int start =  1;

        // int end = 50;
        // while (start <= end) { 
        //     if(start % 3 == 0 &&  start % 5 == 0){
        //       System.out.println( start + " fizzbuzz");
        //     }else if (start % 3 == 0){
        //         System.out.println( start + " fizz");
        //     }else if (start % 5 == 0){
        //         System.out.println( start + " buzz");
        //     }
        //     start = start + 1 ;
        // }
        // do/while loop
        // int i = 0;

        // do {
        //     System.out.println("this is the value of " + i);
        //     i++;
        // } while (i < 5);

        // while (i < 5);
        // {
        //     System.out.println("this is the value of " + i);
        //     i++;
        // }
        // int a = 3;
        // int b = 1 ;
        // while ( b <= 12 ){
        //   System.out.println(a*b);
        //   b++;

        // }
          
        for ( int b = 0 ; b <= 50; b++){
          if(b % 5 == 0 ){
          System.out.println(b);
          }
          else{
            continue;
          }
        } 
    }
}
