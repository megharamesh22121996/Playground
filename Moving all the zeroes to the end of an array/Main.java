import java.util.*; 
class Main
{  
	public static void pushZerosToEnd(int arr[], int n) 
	{ 
		int count = 0; 
		for (int i = 0; i < n; i++) 
			if (arr[i] != 0) 
				arr[count++] = arr[i]; 
		while (count < n) 
			arr[count++] = 0; 
	} 
	public static void main (String[] args) 
	{ 
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
		int arr[] = new int[n]; 
        for(int i=0; i<n; i++)
        {
          arr[i] = in.nextInt();
        }
		pushZerosToEnd(arr, n); 
		for (int i=0; i<n; i++) 
			System.out.print(arr[i]+" "); 
	} 
} 

