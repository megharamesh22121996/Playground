import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int g=1,i,temp;
      temp = gcd(n1,n2);
       for(i = 1; i <= temp && i <= n3; ++i)
        {
            if(temp % i==0 && n3 % i==0)
                g = i;
        }
      System.out.println(g);
    }
  public static int gcd(int a, int b)
  {  
    int g=0;
     for(int i = 1; i <= a && i <= b; ++i)
        {
            if(a % i==0 && b % i==0)
                g=i;
        }
    return(g);
  }
}
      