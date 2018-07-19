import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		int cnt = 0;

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim();
		sc.close();

		if(str.length() == 0)
		{
			cnt = 0;
		}
		else
		{
			cnt = str.split("\\s+").length;
		}
		

		System.out.println(cnt);
	}
}