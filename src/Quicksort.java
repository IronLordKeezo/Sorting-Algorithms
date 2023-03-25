import java.util.LinkedList;

public class Quicksort {

    public static void quicksort(LinkedList<Integer> S) {
        int n = S.size();
        if (n < 2)      // Divide
            return;
        Integer pivot = S.getFirst();
        LinkedList<Integer> Less = new LinkedList<>();
        LinkedList<Integer> Equal = new LinkedList<>();
        LinkedList<Integer> Greater = new LinkedList<>();
        while (!S.isEmpty()) {
            Integer next = S.remove();
            if (next < pivot)
                Less.add(next);             // Add to less list if pivot is greater
            else if (next.equals(pivot))
                Equal.add(next);            // Add to Equal list if equal to pivot
            else
                Greater.add(next);          // Add to Greater list if pivot is less
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

    public static void quicksortInPlace(int[] S, int a, int b) {
        if (a >= b) return;
        int left = a;
        int right = b-1;
        int pivot = S[b];
        int temp;
        while (left <= right) {
            while (left <= right && S[left] < pivot)
                left++;
            while (left <= right && S[right] > pivot)
                right--;
            if (left <= right) {
                temp = S[left];
                S[left] = S[right];
                S[right] = temp;
                left++;
                right--;
            }
        }
        temp = S[left]; S[left] = S[b]; S[b] = temp;
        quicksortInPlace(S, a, left-1);
        quicksortInPlace(S, left+1, b);
    }
}
