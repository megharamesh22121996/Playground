import java.io.*;
import java.lang.*;
import java.util.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      InputStreamReader reader = new InputStreamReader(System.in);
      BufferedReader in = new BufferedReader(reader);
      TreeSet<String> tree = new TreeSet<String>();
      String inputString;
      inputString = in.readLine();
      String arr[] = inputString.split(",");
      for(String s : arr)
      {
        tree.add(s);
      }
      System.out.println(tree);
      while(tree.isEmpty()!=true)
      {
      tree.remove(tree.last());
      System.out.println(tree); 
      }
    }
}