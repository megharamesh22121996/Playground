import java.util.regex.*; 
import java.util.*;

class Main
{ 
  public static void main(String args[]) 
  { 
    Scanner in = new Scanner(System.in);
    String c = in.nextLine();
    String str = in.nextLine();
    Pattern pattern = Pattern.compile(c);  // pattern class used to define the pattern
    Matcher m = pattern.matcher(str); //matcher class used to find the match with the given pattern
    int i = 0;
    while (m.find()) {
      i++;
      
     System.out.println("found: "+i+" : "+m.start() +" - " + (m.end()));
    }
    if(i>0)
    System.out.println(i);
    else
      System.out.println("The given word is not present in the string");
  } 
}