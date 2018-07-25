import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		int[] test = new int[6];
		int i;
		int sum = 0;
		Scanner sc = new Scanner(System.in);

		for (i = 0; i < 5; i++)
		{
			test[i] = sc.nextInt();
		}

		for (i = 0; i < 5; i++)
		{
			if (test[i] < 40)
				sum += 40;
			else
				sum += test[i];
		}

		System.out.printf("%d\n", sum / 5);
	}
}