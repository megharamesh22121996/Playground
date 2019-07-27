import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		String reverse = "";
        String[] split = str.split(" ");
        for (int i = split.length - 1; i >= 0; i--) {
            reverse += (split[i] + " ");
        }
        System.out.println(reverse.trim());
	}
}