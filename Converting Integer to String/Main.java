import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int temp = n;
    if(temp<0)
    {
      temp = temp * -1;
    }
    StringBuilder s = new StringBuilder();
    while(temp>0)
    {
      char ch = (char)((temp%10)+'0');
      s.append(ch);
      temp = temp/10;
    }
    if(n<0)
    {
      System.out.println(s.append('-').reverse());
    }
    else
    {
      System.out.println(s.reverse());
    }
  }
}