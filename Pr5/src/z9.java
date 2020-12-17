import java.util.Scanner;

public class z9 {
    public static int recursion(int a, int b)
    {
        if (a > b + 1)
        {
            return 0;
        }
        if (a == 0 || b == 0)
        {
            return 1;
        }
        return recursion(a, b - 1) + recursion(a - 1, b - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(recursion(a, b));
    }
}
