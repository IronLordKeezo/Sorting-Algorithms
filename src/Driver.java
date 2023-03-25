import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Driver {

    public static void main(String[] args) {
        Random rand = new Random();
        LinkedList<Integer> list = new LinkedList<>();

//        list.enqueue(5);
//        list.enqueue(3);
//        list.enqueue(9);
//        list.enqueue(2);
//        list.enqueue(6);
//        list.enqueue(4);
//        list.enqueue(7);
//        list.enqueue(8);
//        list.enqueue(11);
//        list.enqueue(1);
//        list.enqueue(4);
//        list.enqueue(12);

        for (int i = 0; i < 20; i++) {
            list.add(rand.nextInt(100) + 1);
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
        int size = list.size();
        Quicksort.quicksort(list);
        for (int i = 0; i < size; i++) {
            System.out.print(list.remove() + " ");
        }
    }
}
