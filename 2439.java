import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int i, j, k;
        
        for(i = N; i >= 1; i--)
        {
            for(j = 1; j < i; j++)
            {
                System.out.printf(" ");
            }
            for(k = i; k <= N; k++)
            {
                System.out.printf("*");
            }
            
            System.out.printf("\n");
        }
    }
}