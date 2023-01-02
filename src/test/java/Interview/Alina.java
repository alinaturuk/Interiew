package Interview;

import java.util.List;

public class Alina {
    public static int reduction(List<Integer> num){
        int sum = 0;
        for (int i=0;i<num.size();i++){
            sum=num.get(i)+ num.get(i+1);
        }
        return sum;
    }

    public static void main(String[] args) {

    }
   
}
