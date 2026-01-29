package encapsulation;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = in.nextInt();
        ValidAge obj = new ValidAge();
        obj.setAge(age);
        obj.validate();
    }
}
