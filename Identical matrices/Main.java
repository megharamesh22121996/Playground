import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int a1[][] = new int[r][c];
    int a2[][] = new int[r][c];
    int flag = 1;
    for(int i=0; i<r; i++)
    {
      for(int j=0; j<c; j++)
      {
        a1[i][j] = in.nextInt();
      }
    }
    for(int i=0; i<r; i++)
    {
      for(int j=0; j<c; j++)
      {
        a2[i][j] = in.nextInt();
      }
    }
    for(int i=0; i<r; i++)
    {
      for(int j=0; j<c; j++)
      {
        if(a1[i][j]!=a2[i][j])
        {
          flag = 0;
        }
      }
    }
    if(flag == 0)
    {
        System.out.print("No");
    }
    else
    {
      System.out.print("Yes");
    }
  }
}