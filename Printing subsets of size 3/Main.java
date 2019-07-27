import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a[] = new int[n];
      for(int i=0; i<n; i++)
      {
        a[i] = in.nextInt();
      }
      subset(a,n);
    }
  public static void subset(int a[], int n)
  {
    for(int i=0; i<n-1; i++)
    {
      for(int j=i+1; j<n; j++)
      {
        for(int k=j+1; k<n; k++)
        {
          System.out.print("("+a[i]+", "+a[j]+", "+a[k]+")"+" ");
        }
      }
      System.out.print("\n");
    }
  }
}
