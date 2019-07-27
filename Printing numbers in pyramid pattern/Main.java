import java.util.Scanner;
class Main{
	public static void main (String[] args){
    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int count =0;
      for( int i=0; i<n; i++)
      {
        for( int k=1; k<(n-i); ++k)
        {
           System.out.print(" ");
        }
        for(int j=0; j<=i; j++)
        {
            count = count +1;
            System.out.print(count+" ");
        }
        System.out.print("\n");
      }
    }    
}