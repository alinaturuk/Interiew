package Praсtice;

public class AvgNumInArray {
    public double avgNum(double[] arr){
        double total=0;
        for (int i = 0; i < arr.length; i++) {
total+=arr[i];
        }
total= total/arr.length;
        return total;
    }

    public static void main(String[] args) {
        double[] array= {1,2,3,4,5,6,7,8,9,10};
        AvgNumInArray avgNumInArray= new AvgNumInArray();

        System.out.println(avgNumInArray.avgNum(array));
    }
}
