package Inheritance.multilevel;

public class SubChildClass extends ChildClass{
    String msg3;
    SubChildClass(String msg1, String msg2,String msg3){
        super(msg1,msg2);
        this.msg3 = msg3;
    }
}
