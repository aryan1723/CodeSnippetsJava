package Inheritance.hierarchical;

public class ParentClass {
    int id = (int) (Math.random()*(100+999+1)-100);
    void display(){
        System.out.println("ID: "+id);
    }
}
