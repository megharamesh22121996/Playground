import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      String inputString;
      InputStreamReader reader = new InputStreamReader(System.in);
      BufferedReader in = new BufferedReader(reader);
      LinkedList<String> list = new LinkedList<String>();
      inputString = in.readLine();
      String arr[] = inputString.split(",");
      for(String s : arr)
      {
        list.add(s);
      }
      String chech = in.readLine();
      System.out.println(list);
      System.out.println("Size of the linked list: "+list.size());
      System.out.println("Is LinkedList empty? "+list.isEmpty());
      System.out.println("Does LinkedList contains "+chech+"?");
      System.out.println(list.contains(chech));
    }
}