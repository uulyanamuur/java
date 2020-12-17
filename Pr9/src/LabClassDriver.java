import java.util.Scanner;

public class LabClassDriver {

    private int n;
    Scanner in=new Scanner(System.in);
    Student[] std;

    LabClassDriver()
    {
        System.out.print("Введите количество студентов: ");
        n = in.nextInt();
        std = new Student[n];
        System.out.println("Введите ФИО и id студента");

        for (int i = 0; i < n; i++)
        {
            String F = "";
            F += in.next() + " ";
            F += in.next() + " ";
            F += in.next();
            int id = in.nextInt();
            std[i] = new Student(id, F);
        }
    }

    public void insertSort()
    {
        for (int i = 1; i < n; i++)
        {
            Student t = std[i];
            int key = std[i].getId();
            int j = i-1;
            while ((j >= 0) && (std[j].getId() > key))
            {
                std[j+1] = std[j];
                j--;
            }
            std[j+1] = t;
        }
    }

    public boolean findStudent(String FIO)
    {
        for (int i = 0; i < n; i++)
        {
            if (std[i].getFIO().equals(FIO))
                return true;
        }
        return false;
    }

    public int getId(String FIO)
    {
        for (int i = 0; i < n; i++)
        {
            if (std[i].getFIO().equals(FIO))
                return std[i].getId();
        }
        return 0;
    }
}