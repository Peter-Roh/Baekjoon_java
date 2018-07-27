import java.util.Scanner;
import java.util.Arrays;

class Main
{
	public static void main(String[] args)
	{
		int[] ans = new int[27];
		char[] S = new char[101];
		int i;

		Arrays.fill(ans, -1);

		Scanner sc = new Scanner(System.in);
		S = sc.next().toCharArray();

		int len = S.length;

		for(i = 0; i < len; i++)
		{
			if(ans[S[i] - 'a'] == -1)
				ans[S[i] - 'a'] = i;
		}

		for(i = 0; i < 26; i++)
			System.out.printf("%d ", ans[i]);
	}
}