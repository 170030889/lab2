import java.util.*;
class ReverseString{
   public static void main(String[] args) {
      String string = "abcdef";
      String s2="meow";
      String reverse = new StringBuffer(string).reverse().toString();
      System.out.println("\nString before reverse: "+string);
      System.out.println("String after reverse: "+reverse);
   }
}
