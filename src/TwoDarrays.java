import java.util.Arrays;
import java.util.Random;
public class TwoDarrays {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;

        int[][] array = new int[n][m];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = random.nextInt(20);
            }
        }

        System.out.println("The array:");
        printArray(array);
        for (int j = 0; j < m; j++) {
            sortColumn(array, j);
        }
        System.out.println("Sorted array:");
        printArray(array);
    }

    public static void sortColumn(int[][] array, int column) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i][column];
            int j = i - 1;
            while (j >= 0 && array[j][column] > key) {
                array[j + 1][column] = array[j][column];
                j--;
            }
            array[j + 1][column] = key;
        }
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println();
    }
}