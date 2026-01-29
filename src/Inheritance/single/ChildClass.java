package Inheritance.single;

public class ChildClass extends ParentClass{
    int rollno;
    double cgpa;
    ChildClass(String Name,int rollno,double cgpa){
        super(Name);
        this.rollno = rollno;
        this.cgpa = cgpa;
    }
    void displayDetails(){
        System.out.println("rollno: "+rollno);
        System.out.println("cgpa: "+cgpa);
    }
}
