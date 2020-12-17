import java.util.Scanner;

public class SortByGPA {

        public static void printArray(Student[] arr){
            for (Student j : arr) {
                System.out.print(j.grade + " ");
            }
            System.out.println();
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите размер массива");
            int n = scanner.nextInt();
            Student[] arr = new Student[n];
            for(int i = 0; i < n; i++){
                Student s = new Student(i, i * 2 + 1);
                arr[i] = s;
            }
            printArray(arr);
            SortingStudentsByGPA s = new SortingStudentsByGPA();
            s.quickSort(arr, 0, n - 1);
            printArray(arr);

        }
    }

