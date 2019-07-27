

import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    StringBuilder str1 = new StringBuilder(str);
    int key = in.nextInt();
    int len = str.length();
    for(int i=0; i<=len-1; i++)
    {
      char ch = str.charAt(i);
      if(ch >= 'A' && ch <= 'Z')
       {
           int offset = ch - 'A';
           offset = (offset - key) % 26;
           ch = (char)(offset+'A');
       }
       else if(ch >= 'a' && ch <= 'z')
       {
           int offset = ch - 'a';
           offset = (offset - key) % 26;
         if(offset<0)
           ch = (char)('z' + offset+1);
         else
           ch = (char)(offset + 'a');
       }
       str1.setCharAt(i,ch);
     }
     System.out.print(str1);
  }
}