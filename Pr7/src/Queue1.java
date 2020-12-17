import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Queue1 {

    public static class Queue{
        int n = 0;
        int a[] = new int[100];

        public void offer(int b){
            a[n] = b;
            n++;
        }

        public int poll(){
            int x = a[0];
            for (int i = 0; i < n - 1; i++){
                a[i] = a[i+1];
            }
            n--;
            return x;
        }

        public boolean empty(){
            if (n == 0)
                return true;
            else
                return false;
        }
    };

    public static void main(String[] args){

        int card1, card2;
        Queue firstPlayer = new Queue();
        Queue secondPlayer = new Queue();
        Stack<Integer> d = new Stack<>();
        for (int i = 0; i <= 9; i++){
            d.push(i);
        }
        Collections.shuffle(d);
        for (int i = 0; i <= 4; i++){
            firstPlayer.offer(d.pop());
            secondPlayer.offer(d.pop());
        }
        for (int i = 0; i < firstPlayer.n; i++) {
            System.out.print(firstPlayer.a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < secondPlayer.n; i++) {
            System.out.print(secondPlayer.a[i] + " ");
        }
        System.out.println();
        for (int i = 1; i <= 107; i++){
            if (i == 107){
                System.out.println("botva");
                break;
            }
            card1 = firstPlayer.poll();
            card2 = secondPlayer.poll();
            if (card1 == 0 && card2 == 9){
                firstPlayer.offer(card1);
                firstPlayer.offer(card2);
            }
            else if (card1 == 9 && card2 == 0) {
                secondPlayer.offer(card1);
                secondPlayer.offer(card2);
            }
            else if (card1 > card2){
                firstPlayer.offer(card1);
                firstPlayer.offer(card2);
            }
            else {
                secondPlayer.offer(card1);
                secondPlayer.offer(card2);
            }
            if (firstPlayer.empty()){
                System.out.println("Выиграл второй игрок: " + i);
                break;
            }
            if (secondPlayer.empty()){
                System.out.println("Выиграл первый игрок: " + i);
                break;
            }
        }
    }
}
