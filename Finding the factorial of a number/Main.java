import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in =new Scanner(System.in);
    int n = in.nextInt();
    int fact = factorial(n);
    System.out.println(fact);
  }
  public static int factorial(int n)
  {
    if(n == 0)
    {
      return(1);
    }
    else
    {
      return(n*factorial(n-1));
    }
  }
}