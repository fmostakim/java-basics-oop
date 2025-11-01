class SummationTask implements Runnable{
    private int start;
    private int end;
    private  long partialSum;

    public SummationTask(int start, int end){
        this.start = start;
        this.end = end;
        this.partialSum = 0;
    }
    public long getPartialSum(){
        return partialSum;
    }

    public void run(){
        for(int i= start;i<=end;i++){
            partialSum+=i;
        }
        System.out.println("Thread: "+Thread.currentThread().getName()+" calculated sum from "+start+" to "+partialSum);
    }
}

public class Test13 {
    public static void main(String[] args){
        SummationTask task1 = new SummationTask(1, 500);
        Thread thread1 = new Thread(task1);
        thread1.setName("T1");

        SummationTask task2 = new SummationTask(501, 1000);
        Thread thread2 = new Thread(task2);
        thread2.setName("T2");

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        long totalSum  = task1.getPartialSum()+task2.getPartialSum();

        System.out.println("\nTotal Sum : "+totalSum);
    }
}