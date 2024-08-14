package mergeSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] vetor = {123, 12, 345, 5, 3, 54, 2, 45, 45, 24};

        MergeSort mergeSort = new MergeSort();

        mergeSort.mergeSort(vetor, 0, vetor.length - 1);


        System.out.println(Arrays.toString(vetor));
    }
}

