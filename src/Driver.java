import java.util.Random;

public class Driver {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] S  = {5,3,9,2,6,4,7,8,11,1,4,12};

        for (int i = 0; i < S.length; i++) {
            System.out.print(S[i] + " ");
        }
        System.out.println("");

        Quicksort.quicksortInPlace(S, 0, S.length-1);

        for (int i = 0; i < S.length; i++) {
            System.out.print(S[i] + " ");
        }

//        LinkedList<Integer> list = new LinkedList<>();
//
//        for (int i = 0; i < 20; i++) {
//            list.add(rand.nextInt(100) + 1);
//            System.out.print(list.get(i) + " ");
//        }
//
//        System.out.println();
//        int size = list.size();
//        Quicksort.quicksort(list);
//        for (int i = 0; i < size; i++)
//            System.out.print(list.remove() + " ");
    }
}
