import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char asc;

		asc = sc.next().charAt(0);
		int iasc = (int)asc;

		System.out.println(iasc);
	}
}