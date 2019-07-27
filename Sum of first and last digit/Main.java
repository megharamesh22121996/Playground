import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int f_d = 0;
      int l_d = n % 10;
      while(n >= 10)
      {
        f_d = n / 10;
        n = n / 10;
      }
      int sum = f_d + l_d;
      System.out.println(sum);
	}
}