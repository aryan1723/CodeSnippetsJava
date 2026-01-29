package Inheritance.hierarchical;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Enter Name and Email");
        Scanner in = new Scanner(System.in);
        ChildClassOne childoneobj = new ChildClassOne(in.nextLine());
        childoneobj.display(); //displaying id through childone object
        System.out.println("Name: "+childoneobj.name);
        ChildClassTwo childtwoobj = new ChildClassTwo(in.nextLine());
        childoneobj.display(); //displaying id through childone object
        System.out.println("Email: "+childtwoobj.email);

        // ParentClass -> ChildOne
        //             -> ChildTwo

    }
}
