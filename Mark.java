public class Mark {
    public static void main(String[] args) {
        // no. of items, priceperitem , currency,total

        int no_cheese = 39;
        float priceperitem = 9.99f;
        char currency = '$';
        float total = no_cheese * priceperitem;
        System.out.println(currency + total);
         
         System.out.println("************");

        int no_fruit = 12;
        double priceitem = 10.99;
        char currenc = '$';
        double totl = no_fruit * priceitem;
        System.out.println(currenc + totl);

         System.out.println("************");

        int no_ball = 10;
        double priceite = 5.98;
        char curren = '$';
        double tot = no_ball * priceite;
        System.out.println(curren + tot);

         System.out.println("************");
        
        System.out.println(total + totl + tot);
//   calculate age based on birth year
    }
}
