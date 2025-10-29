package BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
         int[] arr = {8, 2, 4, 9, 10, 3, 12, 5};


          System.out.println(Arrays.toString(arr));

            for (int i = 0; i < arr.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                 if (arr[j] > arr[j + 1]) {
                     int temp = arr[j];
                     arr[j] = arr[j + 1];
                     arr[j + 1] = temp;
                     isSorted = false;
                }

            }

            if (isSorted) {
                break;
            }

        }
        System.out.println("-------------------");
        System.out.println(Arrays.toString(arr));

    }
}
