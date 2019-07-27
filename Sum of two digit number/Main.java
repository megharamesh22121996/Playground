import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int first=n1/10;
      int second=n1%10;
      int sum=first+second;
      System.out.println(sum);
	}
}