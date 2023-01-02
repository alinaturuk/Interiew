package Interview;
import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
    String str = "fresher";
    String str2 = "refresh";

    char[] one = str.toCharArray();
    char[] two= str2.toCharArray();

        Arrays.sort(one);
        Arrays.sort(two);

        if(Arrays.equals(one,two)){
        System.out.println("Anagram");
    }else{
        System.out.println("Not Anagram");
    }
    }
   }

    /*    given two Strings
        find if they are anagram or not
        the characters are the same in both string, but the order is different
                 listen
                 silent  */