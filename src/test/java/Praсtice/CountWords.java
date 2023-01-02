package Praсtice;

public class CountWords {
    public int wordsCount(String str){

        String [] arr= str.split(" ");
        int count=0;
        count=arr.length;
        return count;
    }
    public int wordsCountSecond(String str){

        int count=0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==' '){
                count++;
            }
        }

        return count+1;
    }


    public static void main(String[] args) {
        String srt= "I love my self";

        CountWords countWords= new CountWords();
        System.out.println(countWords.wordsCount(srt));

        System.out.println(countWords.wordsCountSecond(srt));
    }
}
