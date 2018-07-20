import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		int i;
		int[] cnt = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int ans = A * B * C;

		while(ans != 0)
		{
			cnt[ans % 10]++;
			ans /= 10;
		}

		for(i = 0; i < 10; i++)
		{
			System.out.printf("%d\n", cnt[i]);
		}
	}
}