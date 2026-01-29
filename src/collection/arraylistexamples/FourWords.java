package collection.arraylistexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FourWords {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        ArrayList<String> Words = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        for (String str : Words) {
            boolean flag = true;
            if (str.length() == 4) {
                for (int j = 0; j < str.length(); j++) {
                    if ((str.charAt(j) >= 'a' && str.charAt(j) <= 'z') || (str.charAt(j) >= 'A' && str.charAt(j) <= 'Z')) {
                    } else {
                        flag = false;
                        break;
                    }
                }
            } else flag = false;
            if (flag) System.out.println(str);
        }
    }
}
