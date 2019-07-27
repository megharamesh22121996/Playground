import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      String sb = in.nextLine();
      int count = 0; 
      int i = 0;
        while ((i = str.indexOf(sb, i)) != -1 )
        {
            count++;
            i++;
            
        }
        System.out.println(count);
    }
}