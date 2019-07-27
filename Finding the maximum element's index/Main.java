import java.util.*;
class Main
{
  public static void main(String[] args) 
	{
      Scanner in = new Scanner(System.in);
      int n =in.nextInt();
	  int a[] = new int[n];
        for(int i=0; i<n; i++)
        {
          a[i]= in.nextInt();
        }
      maxindex(a,n);
    }
public static void maxindex(int a[], int n)
{
		int max = a[0];
		int index = 0;

		for (int i = 0; i < n; i++) 
		{
			if (max < a[i]) 
			{
				max = a[i];
				index = i;
			}
		}

		System.out.println(index);
}
} 