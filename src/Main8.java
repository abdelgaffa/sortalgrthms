import java.util.Arrays;
import java.util.Random;
public class Main8{
    public static void main(String args[]){
        int n = 10;
        int[]array = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
                array[i] = random.nextInt(20);
            }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println("\n");
        sortArray(array);
        System.out.println("Sorted array: ");
        printArray(array, n);
    }
    public static void sortLeftHalf(int[] array) {
        for (int i = 0; i < array.length / 2 - 1; i++) {
            for (int j = 0; j < array.length / 2 - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int a = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = a;
                }
            }
        }
    }

    public static void sortRightHalf(int[] array) {
        for (int i = array.length / 2; i < array.length - 1; i++) {
            for (int j = array.length / 2; j < array.length - i - 1 + array.length / 2; j++) {
                if (array[j] > array[j + 1]) {
                    int a = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = a;
                }
            }
        }
    }
    public static void sortArray(int[] array) {
        sortRightHalf(array);
        sortLeftHalf(array);
    }

    static void printArray(int arr[], int size) {

        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
  