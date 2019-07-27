import java.util.*;
class Main
{
  
public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    String input = in.nextLine();

    checkPangram(input);
}

private static void checkPangram(String input)
{
    input = input.toLowerCase();
    String alph = "abcdefghijklmnopqrstuvwxyz";
    int max = 26;

    for (int i = 0; i < max; i++)
    {
        int index = input.indexOf(alph.charAt(i));
        if (index != -1)
        {
            alph = alph.substring(0, i) + alph.substring(i + 1);
            i--;
            max--;
          
        }
    }
  for(int i=0; i<(alph.length()); i++)
  {
    if (alph.length() != 0)
         System.out.print(alph.charAt(i)+" ");
}
}
}

