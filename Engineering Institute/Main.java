import java.util.*;

class Faculty
{
    int sal;
    public int getSal()
    {
        return sal;
    }
    public void setSal(int sal)
    {
        this.sal = sal;
    }
    public void salary()
    {
        System.out.println("Base Salary: "+sal);
    }
}
class CSE extends Faculty
{
  public void salary(int a)
  {
    int sal1 = a+3000;
    System.out.println("CSE Faculty: "+sal1);
  }
}
class IT extends Faculty
{
  public void salary(int a)
  {
    int sal1 = a+5000;
    System.out.println("IT Faculty: "+sal1);
  }
}
class ECE extends Faculty
{
  public void salary(int a)
  {
    int sal1 = a+4500;
    System.out.println("ECE Faculty: "+sal1);
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    Faculty fac = new Faculty();
    ECE obj = new ECE();
    IT obj1 = new IT();
    CSE obj2 = new CSE();
    int n = in.nextInt();
    fac.setSal(n);
    fac.salary();
    obj2.salary(n);
    obj1.salary(n);
    obj.salary(n);
  }
}