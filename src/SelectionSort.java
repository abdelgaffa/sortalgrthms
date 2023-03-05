import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {-100, 200, 10, 15, 32 , 23, 12, 56, 65, 1, 0};
        int numOfSwaps = selectionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println();
        System.out.println("Number of Swaps: " + numOfSwaps);
        System.out.println("---------------------------------------");
        System.out.println();
    }

    public static int selectionSort(int[] arr) {
        int n = arr.length;
        int numOfSwaps = 0;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = findMinIndex(arr, i, n);
            if (i!= minIndex) {
                swap(arr, i, minIndex);
                numOfSwaps++;
            }
        }
        return numOfSwaps;
    }

    public static int findMinIndex(int[] arr, int start, int end) {
        int minIndex = start;
        for (int i = start + 1; i < end; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}