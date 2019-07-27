import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class Main{
    public static void main(String args[]){
       Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      String arr[] = str.split(" |\\,|and|or");
      for(String w:arr){
          System.out.println(w);
      }
        
    }
}