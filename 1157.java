import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		char[] str = new char[1000001];
		int[] ans = new int[27];
		int i;
		int max = 0;
		char sol = 0;

		Scanner sc = new Scanner(System.in);

		str = sc.next().toCharArray();

		int len = str.length;

		for(i = 0; i < len; i++)
		{
			if('a' <= str[i] && str[i] <= 'z')
			{
				ans[str[i] - 'a']++;
			}
			else
			{
				ans[str[i] - 'A']++;
			}
		}

		for(i = 0; i < 26; i++)
		{
			if(max < ans[i])
			{
				max = ans[i];
				sol = (char)(i + 'A');
			}
			else if(max == ans[i])
			{
				sol = '?';
			}
		}

		System.out.printf("%c", sol);
	}
}