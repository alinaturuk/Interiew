package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Walmart {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2,3,2,5,4,7,2,4));
        ArrayList<Integer> uniqeList = new ArrayList<>();

        int num = 0;
        for (int i = 0; i < nums.size(); i++) {
            int frequency = Collections.frequency(nums, nums.get(i));
            if (frequency == 1) {
                uniqeList.add(nums.get(i));

                num += nums.get(i);

            }
        }
        System.out.println(num);
    }
}
