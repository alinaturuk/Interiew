package Interview;

import java.util.*;

public class Unique_element_of_Array {
    public static void main(String[] args) {
        
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2,3,2,5,4,7,2,4));
        ArrayList<Integer> uniqeList = new ArrayList<>();

        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            int frequency = Collections.frequency(nums, nums.get(i));
            if (frequency == 1) {
                uniqeList.add(nums.get(i));
                count += nums.get(i);

            }
        }
        System.out.println(count);
        remoceDuplicate();
    }
    public static void remoceDuplicate(){

       Integer [] array={2,3,2,5,4,7,2,4};
        Set<Integer> set= new LinkedHashSet<>(Arrays.asList(array));
        System.out.println(set);
    }
}
