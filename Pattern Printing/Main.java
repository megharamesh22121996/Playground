import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
      int row = in.nextInt();
      int column = in.nextInt();
      int temp =0;
      for (int i = row; i >= 1; i--)
        {
            for (int j = column ; j >= i; j--)
            {
                System.out.print(j);
                temp =j;
            }
            for (int k = row - i+1; k < row; k++)
            {
                System.out.print(temp);
            }
            System.out.println();
        }
            
    }
}