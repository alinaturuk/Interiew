package Interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
// create map with 5 key and value

public class createMap {
    public static void main(String[] args) {
        Map<Object, String> str= new HashMap<>();
        Map<Object, String> str2= new HashMap<>();
        ArrayList<String> arr= new ArrayList<>();

        str.put(1, "Alina");
        str.put(2,"Zeynep");
        str.put(3,"Anna");
        str.put(4,"Alex");
        str.put(5,"Sima");

        for (int i=1; i<=str.size();i++){

           str2.put(i,str.get(i)+" usa");
        }

        System.out.println(str2);
    }
}
