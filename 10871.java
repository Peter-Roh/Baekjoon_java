import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();

		int[] seq = new int[10001];

		int input, i;

		for(i = 0; i < n; i++)
		{
			input = sc.nextInt();
			seq[i] = input;
		}

		for(i = 0; i < n; i++)
		{
			if(x > seq[i])
			{
				System.out.printf("%d ", seq[i]);
			}
		}


		sc.close();
	}
}