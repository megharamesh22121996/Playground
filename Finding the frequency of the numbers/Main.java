import java.util.*;

class Main 
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i] = in.nextInt();
        }
        for(int l=1; l<=k; l++)
        {
            int count = 0;
            for(int i=0; i<n; i++)
            {
                
                if(a[i]==l)
                {
                    count++;
                    b[l]=count;
                }
                
            }
        }
        for(int i=1;i<=k;i++)
        {
            System.out.println(i+" "+b[i]);
        }
    }
}