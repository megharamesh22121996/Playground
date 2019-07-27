import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int first=n/100;
      int third=n%10;
      int sum=first+third;
      System.out.println(sum);
	}
}