package Interview;

public class Interview {

// reverse number
public static void main(String[] args) {

       int number= 1234;
       int reverse=0;

       while (number!=0){
           int digit= number%10;
           reverse=reverse*10+digit;

           number/=10;
       }
        System.out.println("reverse num  "+ reverse);
    }
}
