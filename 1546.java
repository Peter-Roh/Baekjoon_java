import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		int i;
		double mean = 0;

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] num = new int[1000];
		double[] changed = new double[1000];
		int max = 0;

		for(i = 0; i < N; i++)
		{
			num[i] = sc.nextInt();
		}

		for(i = 0; i < N; i++)
		{
			if(max <= num[i])
			{
				max = num[i];
			}
		}

		for(i = 0; i < N; i++)
		{
			changed[i] = (num[i] / (double)max) * 100;
			mean += changed[i];
		}

		mean = (double)mean / (double)N;

		System.out.printf("%.2f\n", mean);
	}
}