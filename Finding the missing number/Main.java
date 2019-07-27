import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a[] = new int[n];
      int total = 0;
      for(int i=0; i<n; i++)
      {
        a[i] = in.nextInt();
      }
      int i;
		for (i = 0; i < n; i++) { 
            int abs_val = Math.abs(a[i]); 
            if (a[abs_val - 1] > 0) 
                a[abs_val - 1] = -a[abs_val - 1];  
        } 
        for (i = 0; i < n; i++) { 
            if (a[i] > 0) 
                System.out.println(i + 1); 
        }
    }
}