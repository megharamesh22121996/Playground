import java.util.*;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int e = in.nextInt();
      double p = power(n,e);
      System.out.println(p);
	}
  public static double power( double a, double b)
  {
    double po = Math.pow(a,b);
    return(po);
  }
}