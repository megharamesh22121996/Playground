import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
     int n, temp, r, sum = 0, i, fact;
      n = in.nextInt();
      temp = n;
		while( temp > 0)
		{
			fact = 1; 
		    r = temp % 10;
		    for( i = 1; i <= r; i++)
		    {
		     	fact = fact * i; 	
		    }
		     sum = sum + fact;
		     temp = temp /10;
		}
      if ( n == sum )
		{
			System.out.println("Yes");
		}
		else
		{
		   System.out.println("No");
		}
    }
}