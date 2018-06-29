import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String message = sc.nextLine();

		int N = message.length() / 10;
		int i;

		for(i = 0; i < N + 1; i++)
		{
			if(i >= N)
			{
				System.out.println(message.substring(10 * i));
				break;	
			}

			System.out.println(message.substring(10 * i, 10 + (10 * i)));
		}

		sc.close();
	}
}