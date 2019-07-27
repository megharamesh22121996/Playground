import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      String name = in.nextLine();
          int n = in.nextInt();
      details obj = new details();
      if(n == 1)
      {
         obj.notificationsBySms(name);
      }
      else if(n == 2)
      {
        obj.notificationsByEmail(name);
      }
            else if(n == 3)
      {
        obj.notificationsByCourier(name);
      }
    }
}
interface notification
{
  void notificationsBySms(String name);
  void notificationsByEmail(String name);
  void notificationsByCourier(String name);
}
class details implements notification
{
	public void notificationsBySms(String name)
	{
		System.out.println(name+"-Notification by SMS");
	}
	public void notificationsByEmail(String name)
	{
		System.out.println(name+"-Notification by Mail");
	}
	public void notificationsByCourier(String name)
	{
		System.out.println(name+"-Notification by Courier");
	}
}

