package collections.setexamples;

import java.util.HashSet;

public class SetBasics {
    public static void main(String args[]){
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        b.add(5);
        b.add(6);
        b.add(7);
        b.add(8);
        a.addAll(b);
        for(Integer var:a){
            System.out.println(var);
        }
        if(a.contains(2)){
            System.out.println("Set a contains 2");
        }
    }
}
