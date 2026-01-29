package polymorphism.compiletimepolymorphism;

public class Addition {
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void add(int a,int b,int c,int d){
        System.out.println(a+b+c+d);
    }
    public static void main(String[] args){
        Addition obj = new Addition();
        obj.add(2,2);
        obj.add(2,7,5);
        obj.add(2,7,5,6);
    }
}
