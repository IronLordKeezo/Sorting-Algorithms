import java.util.LinkedList;
import java.util.Random;

public class Driver {

    public static void main(String[] args) {
        int[] S  = {5,3,9,2,6,4,7,8,11,1,4,12};

        System.out.println("Unsorted list to be sorted with quicksortInPlace:");
        for (int i = 0; i < S.length; i++)
            System.out.print(S[i] + " ");

        long start = System.nanoTime();
        Quicksort.quicksortInPlace(S, 0, S.length-1);
        long end = System.nanoTime();

        System.out.println("\nSorted list sorted with quicksortInPlace:");
        for (int i = 0; i < S.length; i++)
            System.out.print(S[i] + " ");

        System.out.println("\n////////////////////////////////////////////");
        System.out.println("////////////////////////////////////////////");

        Random rand = new Random();
        LinkedList<Integer> list = new LinkedList<>();
        int[] S2  = {5,3,9,2,6,4,7,8,11,1,4,12};

        System.out.println("Unsorted list to be sorted with quicksort:");
        for (int i = 0; i < S2.length; i++) {
//            list.add(rand.nextInt(100) + 1);
            list.add(S[i]);
            System.out.print(list.get(i) + " ");
        }
        int size = list.size();
        long start2 = System.nanoTime();
        Quicksort.quicksort(list);
        long end2 = System.nanoTime();

        System.out.println("\nSorted list sorted with quicksort:");
        for (int i = 0; i < size; i++)
            System.out.print(list.remove() + " ");

        System.out.println("\n////////////////////////////////////////////");
        System.out.println("////////////////////////////////////////////");

        System.out.println("Time taken to quicksortInPlace: " + (end-start) + " ns");
        System.out.println("Time taken to quicksortInPlace: " + (end-start)/1000000 + " ms");
        System.out.println("////////////////////////////////////////////");
        System.out.println("Time taken to quicksort: " + (end2-start2) + " ns");
        System.out.println("Time taken to quicksort: " + (end2-start2)/1000000 + " ms");


    }
}
