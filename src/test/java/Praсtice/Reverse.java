package Praсtice;

public class Reverse {
    public static String ReverseTraditional(String str){
        String reverse="";
        for (int i = 0; i < str.length() ; i++) {
            // for (int i = 0; i <= str.length()-1 ; i++) {
            reverse+=str.charAt(i);
        }
        return reverse;
    }
    public static void main(String[] args) {

        System.out.println(ReverseDecrement("ABCDE"));
        System.out.println(ReverseTraditional("abcde"));

    }
    public static String ReverseDecrement(String str){
        String reverse="";
        for (int i =  str.length()-1; i>0 ; i--) {
          //  reverse=reverse+str.charAt(i);
           reverse=str.charAt(i)+reverse;

        }
        return reverse;
    }


}
