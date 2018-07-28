import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		int i, j, k;
		int R;
		int len;
		char[] str = new char[21];

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for(i = 0; i < T; i++)
		{
			R = sc.nextInt();
			str = sc.next().toCharArray();

			len = str.length;

			for(j = 0; j < len; j++)
			{
				for(k = 0; k < R; k++)
				{
					System.out.printf("%c", str[j]);
				}
			}

			System.out.printf("\n");
		}
	}
}