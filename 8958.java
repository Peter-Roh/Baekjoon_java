import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		int i;
		char[] str = new char[80];
		int cnt = 0;
		int ans = 0;

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while(n-- != 0)
		{
			str = sc.next().toCharArray();
			int len = str.length;

			for(i = 0; i < len; i++)
			{
				if(str[i] == 'O')
				{
					cnt++;
					ans += cnt;
				}
				else
				{
					cnt = 0;
				}
			}

			System.out.printf("%d\n", ans);

			cnt = 0;
			ans = 0;
		}
	}
}