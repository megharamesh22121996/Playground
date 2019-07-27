import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a[] = new int[n];
      for(int i=0; i<n; i++)
      {
        a[i] = in.nextInt();
      }
      int count = 0;
      for(int i=0; i<n; i++)
      {
        for(int j=n-1; j>=0; j--)
        {
          if(a[i]==a[j])
          {
            count++;
          }
      }
      }
      
      if(count==2*n)
      {
        System.out.println("Yes");
      }
        else
        {
          System.out.println("No");
        }
    }
}