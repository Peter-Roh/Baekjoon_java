import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int i = 1;
        
        for(i = 1; i <= 9; i++)
        {
            System.out.printf("%d * %d = %d\n", N, i, N * i);
        }
    }
}