package Inheritance.single;

public class ParentClass {
    private int uid = (int) (Math.random()*(999+100+1))+100;
    String Name = "";

    ParentClass(String name){
        this.Name = name;
    }

    public int getUid() {
        return uid;
    }

    String displayName(){
        return Name;
    }
}
