public class Loops {
    public static void main(String[] args) {
      int start =  1;

      int end = 50;

      while (start <= end) { 
          if(start % 3 == 0 &&  start % 5 == 0){
            System.out.println( start + " fizzbuzz");
          }else if (start % 3 == 0){
              System.out.println( start + " fizz");
          }else if (start % 5 == 0){
              System.out.println( start + " buzz");
          }
          start = start + 1 ;
      }
    }
}
