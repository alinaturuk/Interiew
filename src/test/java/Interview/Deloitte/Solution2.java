package Interview.Deloitte;

public class Solution2 {
    public static void main(String[] args) {
       // int[] A = {180, -50, -25, -25}; // 25
        // int A = {100, 100, 100, -10}; // 230
         int [] A = {1, - 1, 0, -105, 1}; // -164
        // int A = {100, 100, -10, -20, -30}; // 80
        // int A = { -60, 60, -40, -20}; // -115
        String[] D = {"2020-12-31", "2020-12-22", "2020-12-03", "2020-12-29" }; // i did use

        int payment = 12; // months
        int sumPayment = 0;
        int total = 0;
        //  card payment < 0
        // int [] A < 100 => fee ($5) fot having a card every month least 3 payments total cost: $100
        // final balance of the years 2020
        for (int i = 0; i < A.length; i++) {
            sumPayment+= A[i]; //
        }
        System.out.println("Sum payment" + sumPayment);

        for (int j = 0; j < A.length; j++) {
            if (A[j] > 100) {
                payment -= 1;//11
            }
        }
        System.out.println("payment should be  12 :" +payment);
        payment= payment * 5;
        total = sumPayment - payment; //
        System.out.println(total);
    }
}
