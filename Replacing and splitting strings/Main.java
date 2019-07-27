import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      String str1 = in.nextLine();
      String str2 = in.nextLine();
      str1.replaceAll(str1,str2);
      int parts = in.nextInt();
      for(String w:str2.split("\\s",parts)){  
             System.out.println(w);  
}  
    }
}