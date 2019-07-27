import java.util.Scanner;
class Main
{
    public static void main(String[] args) 
    {
        int n;
        String temp;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        String names[] = new String[n+1];
        for(int i = 0; i < n+1; i++)
        {
            names[i] = s.nextLine();
        }
        for (int i = 0; i < n+1; i++) 
        {
            for (int j = i + 1; j < n+1; j++) 
            {
                if (names[i].compareTo(names[j])>0) 
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
      for(int i=1; i<n+1; i++)
      {
        System.out.println(names[i].toLowerCase());
      }
    }
}