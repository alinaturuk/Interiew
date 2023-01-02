package Praсtice;

import java.util.Locale;

public class DoesStringContainVowel {
    // a o e

    public boolean containVowel(String str){
       str= str.toLowerCase();
        boolean verify = false;

        for (int s = 0; s < str.length(); s++) {
            if(str.charAt(s)=='e' || str.charAt(s)=='y' || str.charAt(s)=='u' || str.charAt(s)=='i' || str.charAt(s)=='o' || str.charAt(s)=='a'){
                verify= true;
                
            }
        }
        return verify;
    }

    public boolean containVowelSec(String str){
    boolean verify= str.toLowerCase().matches(".*[aeiou].*");

        return verify;
    }

    public static void main(String[] args) {
        DoesStringContainVowel asd= new DoesStringContainVowel();
        System.out.println("containVowel " + asd.containVowel("CrOOdntd wth dvlprs"));

        System.out.println(asd.containVowelSec("a"));
    }
}
