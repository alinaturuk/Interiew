package Interview;

import java.util.Arrays;

public class fff {

    public static void main(String[] args) {

        int sum=0;

        int arr1[] = {2, 3, 2, 5, 4, 7, 2, 4}; // 3  5  7

        Arrays.sort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            int count =0;
            for (int j = 0; j <arr1.length; j++) {
                if (arr1[i] == arr1[j] && (i!=j)) {
                    count++;
                }
            }
            if (count == 0){

                sum+=arr1[i];

            }
        }
        System.out.print(sum);
    }
}
