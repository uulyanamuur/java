import java.util.Scanner;
import java.util.Stack;

public class main_stack {

    public static int amountOfTry = 0;
    public static int cards = 0;
    public static boolean flag = false;

    public static void main(String[] args) {

        Stack<Integer> firstPlayer = new Stack<Integer>();
        Stack<Integer> secondPlayer = new Stack<Integer>();
        Stack<Integer> dop = new Stack<Integer>();


        System.out.println("Введите количество карт у каждого игрока:");
        Scanner sc = new Scanner(System.in);
        cards = sc.nextInt();
        System.out.println("Введите карты первого игрока:");
        for (int i = 0; i<cards;i++) {
            int x = sc.nextInt();
            dop.push(x);
        }
        for (int i = 0; i<cards; i++){
            firstPlayer.push(dop.pop());
        }
        System.out.println("Введите карты второго игрока:");
        for (int i = 0; i<cards;i++) {
            int x = sc.nextInt();
            dop.add(x);
        }
        for (int i = 0; i<cards; i++){
            secondPlayer.push(dop.pop());
        }

        peek(firstPlayer,secondPlayer);


    }

    public static void peek(Stack<Integer> firstPlayer, Stack<Integer> secondPlayer){
        if(amountOfTry == 106 && !flag){
            System.out.println("botva");
        } else if(!flag){
            amountOfTry++;
            Stack<Integer> dopFP = new Stack<>();
            Stack<Integer> dopSP = new Stack<>();
            int amountCards = 0;
            amountCards = Math.min(firstPlayer.size(), secondPlayer.size());
            for (int i = 0; i < amountCards; i++) {
                if (firstPlayer.size() == 0) {
                    System.out.println("Выиграл второй игрок:");
                    flag = true;
                    break;
                } else if (secondPlayer.size() == 0) {
                    System.out.println("Выиграл первый игрок:");
                    flag = true;
                    break;
                } else {
                    if (firstPlayer.peek() > secondPlayer.peek()) {
                        dopFP.push(firstPlayer.pop());
                        dopFP.push(secondPlayer.pop());
                    } else if (secondPlayer.peek() > firstPlayer.peek()) {
                        dopSP.push(secondPlayer.pop());
                        dopSP.push(firstPlayer.pop());
                    } else {
                        dopFP.push(firstPlayer.pop());
                        dopSP.push(secondPlayer.pop());
                    }
                }
            }
            Stack<Integer> dop = new Stack<>();
            for(int i = 0;i<firstPlayer.size();i++){
                dop.push(firstPlayer.pop());
            }
            for (int i = 0; i<dop.size(); i++){
                firstPlayer.push(dop.pop());
            }
            for(int i = 0;i<secondPlayer.size();i++){
                dop.push(secondPlayer.pop());
            }
            for (int i = 0; i<dop.size(); i++){
                secondPlayer.push(dop.pop());
            }
            peek(dopFP, dopSP);
        }
    }

}
