package Interview;

public class Interview2 {

    // Write a java function to check if a test string has more than 1 occurrence in the array
    public static void main(String[] args) {

            String[] my_array = {"abc", "ghi", "def", "ghi"};
            for (int i = 0; i < my_array.length-1; i++) {
                for (int j = i+1; j < my_array.length; j++) {
                    if( (my_array[i].equals(my_array[j])) && (i != j) )    {
                        System.out.println("Duplicate Element is : "+my_array[j]);
                    }
            }
        }
    }
}
