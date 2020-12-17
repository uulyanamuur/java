import java.util.Scanner;

public class z10 {
    public static int recursion(int n, int i)
    {
        return (n==0) ? i : recursion( n/10, i*10 + n%10 );
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(recursion(n, 0));
    }
}
