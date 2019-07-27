import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int n1 = n;
      double n2 = n;
      double count = 0;
      double amst = 0;
      while( n != 0)
      {
        n = n / 10;
        count = count + 1;
      }
      for( double j = 1; j <= count; j++)
      {
        int k = n1 % 10;
        double power=Math.pow(k,count);
        amst = amst + power;
        n1 = n1 / 10;
      }
      if(amst == n2)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
          System.out.println("Not a Armstrong Number");
      }
}
}