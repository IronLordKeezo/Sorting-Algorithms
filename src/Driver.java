import java.util.LinkedList;
import java.util.Random;

public class Driver {

    public static void main(String[] args) {
        Random rand = new Random();
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            list.add(rand.nextInt(100) + 1);
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
        int size = list.size();
        Quicksort.quicksort(list);
        for (int i = 0; i < size; i++)
            System.out.print(list.remove() + " ");
    }
}
