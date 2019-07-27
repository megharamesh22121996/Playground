import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String str2 = in.nextLine();
    int NO_OF_CHARS = 256;
    int count[] = new int[NO_OF_CHARS]; 
       for (int i = 0; i<str2.length();  i++) 
          count[str2.charAt(i)]++;
    int ip_ind  = 0, res_ind = 0; 
        
      char arr[] = str.toCharArray(); 
        
      while (ip_ind != arr.length) 
      { 
        char temp = arr[ip_ind]; 
        if(count[temp] == 0) 
        { 
            arr[res_ind] = arr[ip_ind]; 
            res_ind ++; 
        } 
            ip_ind++; 
          
      }     
  
      str = new String(arr);
    System.out.println(str.substring(0, res_ind)); 
  }
}