import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        int[] a = {5, 4, 1, 3, 2};
        int[] b = {23, 55, 20, 5, 19, 15, 30, 45, -100};
        bubbleSort (a);
        System.out.println(Arrays.toString(a));
        System.out.println();

        bubbleSort (b);
        System.out.println(Arrays.toString(b));
        System.out.println();
    }

    public static int[] bubbleSort (int[] array) {
        boolean f = false;
        int i = 0;
        while ( !f ) {
            f = true;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                    f = false;
                }
            }
            i++;
        }
        return array;
    }



   // public static void sort(int[] array) {
  //      for (int i = 0; i < array.length - 1; i++) {
            //find the smallest


      //      int index = i;
      //      for (int j = i + 1; j < array.length; j++) {
         //       if (array[j] < array[index]) {
       //             index = j;
           //     }
            //}

        //int tmp = array[i];
          //  array [i] = array[index];
            //array[index] = tmp;


        //}

    //}

}


