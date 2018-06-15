import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int i, j, k;

        for(i = 0; i < N; i++)
	    {
		    for (j = i; j > 0; j--)
		    {
		    	System.out.printf(" ");
	    	}
    		for (k = N; k > i; k --)
    		{
    			System.out.printf("*");
    		}
            
    		System.out.printf("\n");
	    }
    }
}