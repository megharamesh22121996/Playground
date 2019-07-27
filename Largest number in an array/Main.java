import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int arry_size = in.nextInt();
        int[] a = new int[arry_size];
        for( int j = 0; j< arry_size; j++)
          a[j]=in.nextInt();
		int max = a[0];
		for(int i = 1; i < arry_size;i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
		}

		
		System.out.println( max);
      
    }
}