import java.util.Scanner;

public class z8 {
    private static int recursion(String str, int i, int var)
    {
        char[] slovo = str.toCharArray();
        if ((i == slovo.length - 1) && (var == 1))
        {
            System.out.println("YES");
            return 0;
        }
        var = 0;
        if ((slovo.length > i) && (slovo[i] == slovo[slovo.length - i - 1]))
        {
            return recursion(str, i + 1, 1);
        } else
            System.out.println("NO");
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        recursion(s,0,0);
    }
}
