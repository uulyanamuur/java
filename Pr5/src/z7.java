import java.util.Scanner;

public class z7 {
    private static int recursion(int n, int var)
    {
        if (n > 1)
        {
            if (n % var == 0)
            {
                System.out.println(var);
                return recursion(n, var+1);
            }
            else if (n % var != 0 && var < n)
            {
                return recursion(n, var+1);
            }
            else if ( n == var)
            {
                System.out.println(n);
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
        recursion(n,7);
    }

}
