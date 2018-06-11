import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int x = 0;
        int sum = -1;

    	for (x = 0; N >= 0; x++)
	    {
	    	if (N % 5 == 0)
	    	{
	    		sum = x + N / 5;
	    		break;
	    	}
	    	else
	    	{
	    		N = N - 3;
    		}
    	}

    	if (N < 0)
    		sum = -1;
        
        System.out.println(sum);
    }
}