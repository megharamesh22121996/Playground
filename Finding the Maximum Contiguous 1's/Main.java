import java.util.*;
public class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a[] = new int[n];
      for(int i=0; i<n; i++)
      {
        a[i] = in.nextInt();
      }
      int seq[] = new int[n];
      int count = 0;
      for(int i=0; i<n; i++)
      {
        if(a[i]==1)
        {
          count++;
        }
        else
        {
          for(int j=0; j<n; j++)
          {
            seq[i] = count;
          }
        }
      }
      int max=0;
      for(int i=0; i<n-1 ;i++)
      {
        if(seq[i]>seq[i+1])
        {
          max = seq[i];
        }
      }
      System.out.println(max);
    }
}