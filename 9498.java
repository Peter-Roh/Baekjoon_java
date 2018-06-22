import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    	if (n >= 90 && n <= 100)
    	{
	    	System.out.printf("A\n");
    	}
    	else if (n >= 80 && n <= 89)
    	{
    		System.out.printf("B\n");
    	}
    	else if (n >= 70 && n <= 79)
    	{
    		System.out.printf("C\n");
    	}
    	else if (n >= 60 && n <= 69)
    	{
    		System.out.printf("D\n");
    	}
    	else
    	{
    		System.out.printf("F\n");
    	}
    }
}