package collection.arraylistexamples;

import java.util.ArrayList;
import java.util.Arrays;

public class RecuuringElements {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,3,3,5,5,6,6,6,7,7,7));
        for(int i=0;i< list.size()-1;i++){
            for(int j=i+1;j< list.size();j++){
                if(list.get(i) == list.get(j)){
                    list.remove(j);
                    j--;
                }
            }
        }
        for(int i=0;i< list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
