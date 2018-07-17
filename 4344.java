import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		int i, j, k;
		int[] num = new int[1001];

		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();

		for(i = 0; i < C; i++)
		{
			int cnt = 0;
			int sum = 0;
			double mean = 0.0;
			double answer;

			int n = sc.nextInt();

			for(j = 0; j < n; j++)
			{
				num[j] = sc.nextInt();
				sum += num[j];
			}

			mean = (double)sum / (double)n;

			for(k = 0; k < n; k++)
			{
				if(mean < num[k])
				{
					cnt++;
				}
			}

			answer = (double)cnt / (double)n * 100;
			System.out.printf("%.3f%%\n", answer);
			cnt = 0;
		}
	}
}