public class Intro { 
   public static void main(String[] args) {
        System.out.println("Welcome to Java Programming, DRAZEN!");
        add();
        
   }
   public  static int add(){
     int a = 1;
     int b = 2;
     int c = a + b;
     System.out.println(c);
     return c;

   }
}
// In Java, the public keyword is an access modifier. When you declare a class as public, it means that the class can be accessed from any other class in any package. Without public, the class would only be accessible within its own package. This is useful when you want your class to be available for use throughout your project or by external code.


// what is a compiler and interpreter in java
// A compiler translates the entire source code of a program into machine code before execution, while an interpreter translates the source code line by line at runtime.

// interpreter - interpreter lang - python, ruby, javascript
// compiler - compiled lang - c, c++, java