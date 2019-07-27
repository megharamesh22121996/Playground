import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner(System.in);
    int n1=in.nextInt();
    int temp=n1%10;
    int n2=temp;
    n1=n1/10;
    temp=n1%10;
    n2=temp+(n2*10);
    n1=n1/10;
    n2=n1+(n2*10);
    System.out.println(n2);
  }
}