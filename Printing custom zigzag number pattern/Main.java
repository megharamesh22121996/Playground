import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
      int n=in.nextInt();
  for (int row = 0; row < n; row++) {
     for (int col = 0; col < n ; col++) {
        int number = 1;
        if (row % 2 == 0) {
           number = col == n-1 ? row + 2 : row+1;
        } else {
           number = col == 0 ? row + 2 : row +1;
        }
        System.out.print(number);
     }
     System.out.println();
  }
    }
}