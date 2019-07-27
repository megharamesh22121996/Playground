import java.util.*;
class Main
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
    int max_count = 0;
    int curr_count = 0;
    int res = a[0];
    for(int i=0; i<n-1; i++)
    {
      if(a[i]==a[i+1])
      {
        curr_count++;
      }
      else
      {
        if(curr_count>max_count)
        {
          max_count = curr_count;
          res = a[i+1];
        }
        curr_count = 0;
      }
    }
    if(curr_count>max_count)
    {
      max_count = curr_count;
      res = a[n-1];
    }
    System.out.println(res);
  }
}