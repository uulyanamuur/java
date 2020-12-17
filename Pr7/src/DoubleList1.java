import java.util.Collections;
import java.util.Stack;

public class DoubleList1 {

    public static class Dequeue{
        int n = 0;
        int a[] = new int[100];

        public void offerLast(int b){
            a[n] = b;
            n++;
        }

        public void offerFirst(int b){
            for (int i = n;i > 0; i--){
                a[i] = a[i-1];
            }
            a[0] = b;
            n++;
        }

        public int pollFirst(){
            int x = a[0];
            for (int i = 0; i < n - 1; i++){
                a[i] = a[i+1];
            }
            n--;
            return x;
        }

        public int pollLast(){
            n--;
            return a[n];
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
        Dequeue firstPlayer = new Dequeue();
        Dequeue secondPlayer = new Dequeue();
        Stack<Integer> d = new Stack<>();
        for (int i = 0; i <= 9; i++){
            d.push(i);
        }
        Collections.shuffle(d);
        for (int i = 0; i <= 4; i++){
            firstPlayer.offerLast(d.pop());
            secondPlayer.offerLast(d.pop());
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
            card1 = firstPlayer.pollFirst();
            card2 = secondPlayer.pollFirst();
            if (card1 == 0 && card2 == 9){
                firstPlayer.offerLast(card1);
                firstPlayer.offerLast(card2);
            }
            else if (card1 == 9 && card2 == 0) {
                secondPlayer.offerLast(card1);
                secondPlayer.offerLast(card2);
            }
            else if (card1 > card2){
                firstPlayer.offerLast(card1);
                firstPlayer.offerLast(card2);
            }
            else {
                secondPlayer.offerLast(card1);
                secondPlayer.offerLast(card2);
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