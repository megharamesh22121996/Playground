import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      StringBuilder sb = new StringBuilder(str);
      int str_len = sb.length();
      StringBuilder temp = new StringBuilder("");
      for(int i=str_len-1; i>=0; i--)
      {
        char ch = sb.charAt(i);
        temp.append(ch);
      }
      for(int i=0; i<str_len; i++)
      {
        sb.setCharAt(i,temp.charAt(i));
      }
      if(str.equals(temp.toString()))
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    }
}