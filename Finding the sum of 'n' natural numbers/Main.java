import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in =new Scanner(System.in);
    int n = in.nextInt();
    int s = sum(n);
    System.out.println(s);
  }
  public static int sum(int n)
  {
    if(n == 0)
    {
      return(0);
    }
    else
    {
      return(n+sum(n-1));
    }
  }
}