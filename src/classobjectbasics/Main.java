package classobjectbasics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        classObject obj = new classObject(2,5);
        System.out.println("Value of A: "+obj.a);
        System.out.println("Value of B: "+obj.getB()); // Value of b is private but can be accessed through getters
        Scanner in=new Scanner(System.in);
        System.out.println("Do you want to change values of A and B? yes/no");
        String choice = in.nextLine();
        int val1,val2;
        switch (choice){
            case "yes": val1=in.nextInt(); val2= in.nextInt();
            System.out.println("Values have been changed to A = "+val1+", B = "+val2);
            obj.setA(val1); obj.setB(val2);
            break;
            case "no": System.out.println("Values remains same.");
            break;
            default: System.out.println("Invalid choice");
        }
        int result = obj.add();
        System.out.println("Addition: "+result);
        System.out.println("Object = "+obj);
    }
}
