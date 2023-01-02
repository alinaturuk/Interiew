package Praсtice;

import java.util.Arrays;
import java.util.Collections;

public class ArrayMax {
    public static int numMax(int[] array){

      Arrays.sort(array);
        return array[array.length-1];
    }

    public static void main(String[] args) {
        int[] arr={799, 719, 720, 850, 1200};
        System.out.println(numMax(arr));

    }
}
