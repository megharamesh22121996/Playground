import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String str = s.toLowerCase();
        int len = str.length();
        int temp[] = new int[26];
        for(int i=0; i<len; i++)
        {
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
            {
                temp[str.charAt(i) - 'a']++;
            }
        }
        for(int i=0; i<len; i++)
        {
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
            {
                if(temp[str.charAt(i) - 'a'] != 0)
                {
                    System.out.print(str.charAt(i)); 
                    System.out.print(temp[str.charAt(i) - 'a'] + " ");
                    temp[str.charAt(i) - 'a'] = 0;
                }
            }
        }
    }
}