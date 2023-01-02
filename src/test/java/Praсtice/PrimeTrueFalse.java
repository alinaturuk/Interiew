package Praсtice;

public class PrimeTrueFalse {
    //  / selfnum and 1
    public static boolean primeNum(int num){
        boolean isPrime=true;

        if(num<=1){
            isPrime=false;
        }

        for (int i = 2; i <num ; i++) {
            if(num%i==0 ){
                isPrime=false;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        System.out.println(primeNum(11));
    }
}
