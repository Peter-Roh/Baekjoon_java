import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		char[] str = new char[101];
		int cnt = 0;
		int i;

		Scanner sc = new Scanner(System.in);
		str = sc.next().toCharArray();
		int len = str.length;	

		for(i = 1; i < len; i++)
		{
			if(str[i] == '-')
			{
				if(str[i - 1] == 'c')
					cnt++;
				else if(str[i - 1] == 'd')
					cnt++;
			}	

			if(str[i] == 'j')
			{
				if(str[i - 1] == 'l')
					cnt++;
				else if(str[i - 1] == 'n')
					cnt++;
			}	

			if(str[i] == '=')
			{
				if(str[i - 1] == 'c')
					cnt++;
				else if(str[i - 1] == 's')
					cnt++;
				else if(str[i - 1] == 'z' && i - 2 >= 0 && str[i - 2] == 'd')
					cnt++;
				
				if(str[i - 1] == 'z')
					cnt++;
			}
		}

		System.out.printf("%d\n", len - cnt);
	}
}