import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       InputStreamReader reader = new InputStreamReader(System.in);
      BufferedReader in = new BufferedReader(reader);
      Set<String> hash_Set = new LinkedHashSet<String>();
      String inputString;
      inputString = in.readLine();
      String arr[] = inputString.split(",");
      for(String s : arr)
      {
        hash_Set.add(s);
      }
      System.out.println(hash_Set);
      
      String elem1 = in.readLine();
      hash_Set.remove(elem1);
      System.out.println("Enter the value to be deleted: "+elem1);
      System.out.println(hash_Set);
      
      String elem2 = in.readLine();
      hash_Set.add(elem2);
      System.out.println("Enter the value to be added: "+elem2);
      System.out.println(hash_Set);
    }
}