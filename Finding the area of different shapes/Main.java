import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int choice = in.nextInt();
        switch(choice){
       case 1:
            int a = in.nextInt();
            System.out.println(a*a);
            break;
       case 2:
            int b = in.nextInt();
            int c = in.nextInt();
            System.out.println(b*c);
            break;
       case 3:
            int d = in.nextInt();
            int e = in.nextInt();
            System.out.println(0.5*d*e);
            break;
       case 4:
            int f = in.nextInt();
            System.out.println(3.14*f*f);
            break;
     default:
      System.out.println("Enter a valid command"); 
       }
    }
}