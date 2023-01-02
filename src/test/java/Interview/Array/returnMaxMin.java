package Interview.Array;

import io.cucumber.java.sl.In;

import java.lang.reflect.Array;
import java.util.*;

public class returnMaxMin {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(-10);
        list.add(80);
        list.add(-2);
        list.add(15);


        System.out.println(maxMinArray(list));
        returnMaxMin retMinMax= new returnMaxMin();
        System.out.println("retMinMax.arrMaxMinArray(list) = " + retMinMax.arrMaxMinArray(list));
           }

    public static ArrayList<Integer> maxMinArray(List<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        Integer max = 0;
        Integer min = 100000;

        for (Integer each : list) {
            if (each > max) {
                max = each;
            }
            if (each < min) {
                min = each;
            }
        }
        result.add(min);
        result.add(max);
        return result;
    }

    public ArrayList<Integer> arrMaxMinArray(List<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();

        Integer min = Collections.min(list);
        Integer max = Collections.max(list);
        result.add(min);
        result.add(max);

        return result;
    }
}