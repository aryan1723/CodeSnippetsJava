package usingthreads;

class MyTasks extends Thread{
    void task1(){
        System.out.println("this is task1 "+Thread.currentThread().getName());
    }
    void task2(){
        System.out.println("this is task2 "+Thread.currentThread().getName());
    }
    @Override
    public void run(){
        task1();
        task2();
    }
}
public class SimpleThread {
    public static void main(String[] args){
        MyTasks t1 = new MyTasks();
        Thread th1 = new Thread(t1);
        t1.start();
        th1.start();
    }
}
