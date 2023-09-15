package theory.array;

import java.util.Arrays;

public class ArrayMain {
    public static void main(String[] args) {
        int[] copyFrom = {1, 2, 3};

        int[] copyTo1 = Arrays.copyOf(copyFrom, 5);
        int[] copyTo2 = copyFrom;
        int[] copyTo3 = Arrays.copyOfRange(copyFrom, 0, 2);

        int[] compareTo = {0, 2, 3};
        int compare = Arrays.compare(copyFrom, compareTo);

        int[] beforeSort = {5, 4, 3, 2, 1};
        Arrays.sort(beforeSort);
        int result = Arrays.binarySearch(beforeSort, 4);
        System.out.println("result = " + result);

    }
}
