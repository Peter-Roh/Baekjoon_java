import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int sum = A + B;
        int sub = A - B;
        int mul = A * B;
        int div = A / B;
        int rem = A % B;
        
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(rem);
        
    }
}