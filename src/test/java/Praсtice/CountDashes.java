package Praсtice;

public class CountDashes {
    public int num (String str){
        int count=0;


        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='-'){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        CountDashes countDashes= new CountDashes();
        System.out.println("countDashes: " + countDashes.num("I- love - Turuk - -"));
    }
}
