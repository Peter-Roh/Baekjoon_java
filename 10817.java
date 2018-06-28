import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int D;

		if (A <= B)
		{
			D = A;
			A = B;
			B = D;
		}
	
		if (A <= C)
		{
			D = A;
			A = C;
			C = D;
		}

		if (B <= C)
		{
			D = B;
			B = C;
			C = D;
		}
	
		System.out.printf("%d\n", B);

	}
}