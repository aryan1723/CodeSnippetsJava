package usingthreads;

class Factory implements Runnable{
    @Override
    public void run() {
        try{
            System.out.println("Worker goes for work..");
            Thread.sleep(3000);
            System.out.println("Worker has completed his shift.");
        }catch (InterruptedException e){
            System.out.println("Something is wrong");
        }
    }
}

public class RunnableThread {
    public static void main(String[] args){
        Factory worker = new Factory();
        //worker.start() X
        Thread w1 = new Thread(worker);
        w1.start();
    }
}
