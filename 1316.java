import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		int i, j = 0;
		char[] str = new char[101];
		char[] test = new char[101];
		int[] alph = new int[27];
		char temp;
		int len = 0;
		int cnt = 0;

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for(i = 0; i < N; i++)
		{
			str = sc.next().toCharArray();

			len = str.length;

			j = 0;

			temp = str[0];
			test[0] = temp;

			for(j = 1; j < len; j++)
			{
				if(str[j - 1] == str[j])
				{
					test[j] = ' ';
				}
				else if(str[j - 1] != str[j])
				{
					temp = str[j];
					test[j] = temp;
				}
			}

			for(j = 0; j < len; j++)
			{
				if(test[j] == ' ')
					continue;

				alph[test[j] - 'a']++;
			}

			for(j = 0; j < 26; j++)
			{
				if(alph[j] > 1)
				{
					cnt--;
					break;
				}
			}

			cnt++;

			alph = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		}

		System.out.printf("%d\n", cnt);
	}
}