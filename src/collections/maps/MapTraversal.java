package collections.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTraversal {
    public static void main(String[] args){

        //Inertion Logic
        Map<String, Long> studentInfo = new HashMap<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of Entries");
        int totalStudents = in.nextInt();
        in.nextLine();
        System.out.println("Enter key and values");
        for(int i=0;i<totalStudents;i++){
            studentInfo.put(in.nextLine(), in.nextLong());
            in.nextLine();
        }

        //Traversal Logic
        for(Map.Entry<String, Long> data : studentInfo.entrySet()){
            System.out.println(data.getKey()+" : "+data.getValue());
        }

        System.out.println(studentInfo.keySet());

    }
}
