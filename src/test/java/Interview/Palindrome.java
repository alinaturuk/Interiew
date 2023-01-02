package Interview;

import com.sun.jna.StringArray;

import java.lang.reflect.Array;

public class Palindrome {

    public boolean isPalindrome(String str){

        String result="";

        for (int i=str.length()-1; i>=0; i--){
            result+= str.charAt(i);

        }
       return str.equals(result);
    }

    public static void main(String[] args) {
        Palindrome palindrome= new Palindrome();
        System.out.println(palindrome.isPalindrome("anna"));
    }
}
