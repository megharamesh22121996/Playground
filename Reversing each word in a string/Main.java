import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String words[]=str.split("\\s");  
    String reverseWord="";  
    for(String w:words)
    {  
        StringBuilder sb=new StringBuilder(w);  
        sb.reverse();  
        reverseWord+=sb.toString()+" "; 
    }
    System.out.println(reverseWord.trim());
  }
}