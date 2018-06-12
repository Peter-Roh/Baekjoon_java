import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int i;
        
        for(i = N; i >= 1; i--)
        {
            System.out.println(i);
        }
    }
}