package Inheritance.multilevel;

public class ChildClass extends ParentClass{
    String msg2;
    ChildClass(String msg1,String msg2){
        super(msg1);
        this.msg2=msg2;
    }
}
