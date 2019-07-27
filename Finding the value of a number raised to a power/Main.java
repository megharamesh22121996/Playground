import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      int base = in.nextInt();
      int exponent = in.nextInt();
      int result = 1;
      for(int i=0; i<exponent; i++)
      {
        result = result * base;
      }
      System.out.println(result);
    }
}