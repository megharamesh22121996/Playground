import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      prime(n);
	}
  public static void prime(int a)
  {
    for (int i = 1; i <= a; i++)         
       { 		  	  
          int counter=0; 	  
          for(int num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	     System.out.println(i);
	  }		
      
    }
  }
}