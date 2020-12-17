import java.util.Scanner;

public class z6 {
    private static int recursion(int n, int var)
    {
        if (n > 1)
        {
            if (n % var != 0)
            {
                return recursion(n, var+1);
            } else if (n % var == 0)
            {
                if (var == n)
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
                }
                return 0;
            }
        }
        else System.out.println("Число должно быть больше 1!");
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        recursion(n,2);
    }
}
