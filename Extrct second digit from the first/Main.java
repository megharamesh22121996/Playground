import java.util.Scanner;
class Main
{
  public static void main( String args[])
{
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int s_d = 0;
    if( n < 100)
    {
      s_d=n%10;
    }
    else
    {
    while(n > 10 )
    {
      int n1 = n/10;
      n= n/10;
      if(n1 < 100 && n1 > 9)
      { 
        s_d = n1%10;
      }
    }
    }
    System.out.println(s_d);
  }
}