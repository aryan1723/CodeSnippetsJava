package Inheritance.single;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Enter your details Name, Rollno, CGPA.");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int rollno = in.nextInt();
        double cgpa = in.nextDouble();

        ChildClass childobj = new ChildClass(name,rollno,cgpa);
        System.out.println("UID: "+(childobj.getUid())); // getting uid using getters since its private
        String username = childobj.displayName(); // calling parent method through child object
        System.out.println("Name: "+username);
        childobj.displayDetails();

        ParentClass parentobj = new ParentClass(name);
        //parent object can only acess parent variables and parent methods

        ParentClass refparentobj = new ChildClass(name,rollno,cgpa);
        //since the reference is parent so we can only acess parent variables and methods
        //Note:- If the Child has overridden a method from the Parent, the Child's version will run

        // Parent -> Child

    }
}
