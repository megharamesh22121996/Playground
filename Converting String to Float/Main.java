import java.util.Scanner;
class Main{
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        double result = 0.0f;
        int len = str.length();
        int dotpos = 0;
        for(int i=0; i<len; i++)
        {
          if(str.charAt(i)=='.')
          {
            dotpos = len - i - 1;
          }
          else
          {
            result = result * 10 + (str.charAt(i) - '0');
          }
        }
      result = result/Math.pow(10,dotpos);
      System.out.println(result);
    }
}