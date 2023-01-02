package Interview;

public class getSecondSmallestArray {
    public static void main(String args[]) {

      int arr[] = {1, -2, 5, 6, 3, 2};
    System.out.println(getSecondSmallest(arr));    }

    public static int getSecondSmallest(int[] array) {

        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array[1];
    }
}
