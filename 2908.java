import java.util.Scanner;

class Reverse
{
	public int reverse(int n)
	{
		int a, b, c;
		int reverse;

		a = (n - (n % 100)) / 100;
		b = (n - 100 * a - ((n - 100 * a) % 10)) / 10;
		c = (n - 100 * a - 10 * b);

		reverse = 100 * c + 10 * b + a;

		return reverse;
	}
}

class Main
{
	public static void main(String[] args)
	{
		int rev_a, rev_b;

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		Reverse re = new Reverse();

		rev_a = re.reverse(a);
		rev_b = re.reverse(b);

		if(rev_a > rev_b)
			System.out.printf("%d\n", rev_a);
		else
			System.out.printf("%d\n", rev_b);
	}
}