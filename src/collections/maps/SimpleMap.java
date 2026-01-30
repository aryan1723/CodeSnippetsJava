package collections.maps;

import java.util.HashMap;
import java.util.Map;

public class SimpleMap {
    public static void main(String[] args){
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Aryan",20);
        System.out.println(marks.get("Aryan"));
        System.out.println("Size: "+marks.size());

        marks.replace("Aryan",15);
        System.out.println(marks.get("Aryan"));

        marks.remove("Aryan");
        System.out.println("Size: "+marks.size());

        marks.clear();
        System.out.println("Size: "+marks.size());
        System.out.println(marks.getOrDefault("Aryan",0));

    }
}
