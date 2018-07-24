import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		int[] arr = new int[9];
		int i;
		int asc = 0;
		int des = 0;

		Scanner sc = new Scanner(System.in);

		for(i = 0; i < 8; i++)
		{
			arr[i] = sc.nextInt();

			if(arr[i] == i + 1)
				asc++;
			else if(arr[i] == 8 - i)
				des++;
		}

		if(asc == 8)
			System.out.printf("ascending\n");
		else if(des == 8)
			System.out.printf("descending\n");
		else
			System.out.printf("mixed\n");
	}
}