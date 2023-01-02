package Praсtice;

public class ReverseString {
    public static StringBuilder reverseWord(String str){
        StringBuilder reverse= new StringBuilder();
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse.append(str.charAt(i));
        }
        return reverse;
    }

    public static String reverseSentence(String str){
        String reversed="";
        String [] array=str.split(" ");

        for (String each: array){
            reversed+=" ";
            for (int i = each.length()-1; i>=0; i--) {
                reversed+=each.charAt(i);

            }

        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println("reverseWord(\"Alina\") = " + reverseWord("Alina"));

        System.out.println("Sentence: "+ reverseSentence("Alina Turuk and Alex Turuk "));
    }
}
