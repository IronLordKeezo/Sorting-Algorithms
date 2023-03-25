import java.util.Arrays;

public class MergeSort {

    public static void merge(int[] S, int[] S1, int[] S2) {
        int i = 0, j = 0;
        while (i + j < S.length) {
            if (j == S2.length || (i < S1.length && S1[i] < S2[j]))
                S[i+j] = S1[i++]; // copy ith element of S1 and increment i
            else
               S[i+j] = S2[j++]; // copy jth element of S2 and increment j
        }
    }
    public static void mergesort(int[] S) {
        int n = S.length;
        if (n < 2) return;
        int mid = n/2;
        int[] left = Arrays.copyOfRange(S, 0, mid);
        int[] right = Arrays.copyOfRange(S, mid, n);
        mergesort(left);
        mergesort(right);
        merge(S, left, right);
    }
}
