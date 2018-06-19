import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        
        int i;
        int sum = 0;

        for(i = 0; i < n; i++)
        {
            sum += str.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}