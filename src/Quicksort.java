import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class Quicksort {

    public static void quicksort(LinkedList<Integer> S) {
        int n = S.size();
        if (n < 2)      // divide
            return;
        Integer pivot = S.getFirst();
        LinkedList<Integer> Less = new LinkedList<>();
        LinkedList<Integer> Equal = new LinkedList<>();
        LinkedList<Integer> Greater = new LinkedList<>();
        while (!S.isEmpty()) {
            Integer next = S.remove();
            if (next < pivot)
                Less.add(next);
            else if (next == pivot)
                Equal.add(next);
            else
                Greater.add(next);
        }
        quicksort(Less);      // conquer the Less list
        quicksort(Greater);   // Conquer the Greater list

        while (!Less.isEmpty())
            S.add(Less.remove());      // Combine the Less list into Single list until Empty
        while (!Equal.isEmpty())
            S.add(Equal.remove());     // Combine the Equal list into Single list until Empty
        while (!Greater.isEmpty())
            S.add(Greater.remove());   // Combine the Greater list into Single list until Empty
    }
}
