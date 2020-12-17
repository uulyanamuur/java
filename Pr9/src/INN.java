import java.util.ArrayList;
import java.util.Scanner;

public class INN {

    Scanner scan = new Scanner(System.in);
    ArrayList<String> FD = new ArrayList<String>();
    ArrayList<Integer> ID = new ArrayList<Integer>();
    String F = "";
    int I;

    INN()
    {
        System.out.println("Введите базу данных в формате: ФИО и ИНН. \nВведите 0 для завершения!");

        F += scan.next() + " ";
        if (F.equals("0 "))
        {
            return;
        }
        F += scan.next() + " ";
        F += scan.next();

        while(true)
        {
            FD.add(F);
            I = scan.nextInt();

            ID.add(I);

            F = "";
            F += scan.next() + " ";
            if (F.equals("0 "))
                break;
            F += scan.next() + " ";
            F += scan.next();
        }

        try{
            checking();
        }
        catch (INNException e)
        {
            System.out.println(e.getMessage());
        }
    }

    void checking() throws INNException
    {
        System.out.println("Введите ФИО и ИНН");

        F = "";
        F += scan.next() + " ";
        F += scan.next() + " ";
        F += scan.next();
        I = scan.nextInt();
        for (int i = 0; i < FD.size(); i++) {
            if (FD.get(i).equals(F)) {
                if (ID.get(i) == I)
                {
                    System.out.println("Все верно!");
                    return;
                }
                else throw new INNException("Неверный ИНН!");
            }
        }
        throw new INNException("ФИО не найдено!");
    }

    void checklength(int I) throws INNException
    {
        if (Integer.toString(I).length() == 12)
            System.out.println("Запись добавлена!");
        else
            throw new INNException("Неверный ИНН!");
    }
}