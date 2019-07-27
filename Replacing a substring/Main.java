import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      Scanner in = new Scanner(System.in);
      String str1 = in.nextLine();
      String str2 = in.nextLine();
      String str3 = in.nextLine();
      boolean temp = str1.contains(str2);
      if(temp == true)
      {
        System.out.println(str1.replace(str2,str3));
      }
    }
}