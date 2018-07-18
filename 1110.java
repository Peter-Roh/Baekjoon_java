import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		int k;
		int t = 100, i = 0;

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n < 10)
		{
			n *= 10;
		}

		k = n;

		while (k != t)
		{
			t = (n % 10) * 10 + ((n / 10) + (n % 10)) % 10;
			n = t;
			i++;
		}

		System.out.printf("%d\n", i);
	}
}