import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int ans1 = (A + B) % C;
        int ans2 = (A % C + B % C) % C;
        int ans3 = (A * B) % C;
        int ans4 = (A % C * B % C) % C;
        
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);

    }
}