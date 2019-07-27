import java.util.Scanner;
import java.util.InputMismatchException;
public class Main
{
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
      String str = in.nextLine();
     if (isNumber(str)) 
            System.out.println(str); 
     else
            System.out.println("Input Mismatch Exception occurred"); 
   }
  static boolean isNumber(String s) 
    { 
        for (int i = 0; i < s.length(); i++) 
        if (Character.isDigit(s.charAt(i))  
            == false) 
            return false; 
  
        return true; 
    } 
}
