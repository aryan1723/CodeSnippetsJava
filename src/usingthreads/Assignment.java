package usingthreads;

interface Task{
    void executes();
}

class DataCollector extends Thread implements Task{
    @Override
    public void executes(){
        try{
            System.out.println("collecting data");
            Thread.sleep(3000);
            System.out.println("data collected");
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    @Override
    public void run(){
        executes();
    }
}

public class Assignment {
    public static void main(String[] args) throws InterruptedException {
        DataCollector t1 = new DataCollector();
        t1.start();
        t1.setName("Collector 1");
        DataCollector processor = new DataCollector(){
              public void run(){
                  System.out.println("Processor Waiting for data...");
              }
        };
        processor.start();
        t1.join();
        System.out.println("Collection completed");
    }
}
