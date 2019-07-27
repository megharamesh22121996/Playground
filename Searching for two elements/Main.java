import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
      int arry_size = in.nextInt();
      int arry[] = new int[arry_size];
      for( int i=0; i<arry_size; i++)
        arry[i] = in.nextInt();
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      for( int j=0; j<arry_size; j++)
      {
        if( arry[j]==n1 || arry[j]==n2)
        {
           System.out.println(j);
        }
      }
      if( n2==1000)
      {
        System.out.println("-1");
      }
    }
}