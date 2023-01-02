package Praсtice;

import java.util.Arrays;

public class AscciValue {
    public static int[] num (String str){
        int [] result=new int[str.length()];

        for (int i = 0; i < str.length(); i++) {

            result[i]= (int)( str.charAt(i));
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(num("I want ")));
    }
}
