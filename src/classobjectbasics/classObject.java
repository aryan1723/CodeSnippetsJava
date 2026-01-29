package classobjectbasics;

public class classObject {
    int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public  int getB(){
        return b;
    }

    classObject(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int add(){
        return a+b;
    }

    @Override
    public String toString() {
        return "classObject{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
