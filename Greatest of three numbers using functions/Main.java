import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int temp;
      temp = greatest(n1,n2);
      if(temp > n3)
        System.out.println(temp);
      else
        System.out.println(n3);
	}
  public static int greatest(int a, int b)
  {
    if(a>b)
      return(a);
    else
      return(b);
  }   
}