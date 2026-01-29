package Inheritance.multilevel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("enter msg for parent then child and last for subchild class");
        Scanner in = new Scanner(System.in);
        String msg1 = in.nextLine();
        String msg2 = in.nextLine();
        String msg3 = in.nextLine();
        SubChildClass subchildobj = new SubChildClass(msg1,msg2,msg3);
        System.out.println("Parent msg: "+subchildobj.msg1);
        System.out.println("Child msg: "+subchildobj.msg2);
        System.out.println("SubChildT msg: "+subchildobj.msg3);

        //Parent -> Child -> SubChild

    }
}
