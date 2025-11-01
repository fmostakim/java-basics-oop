class Mythread extends Thread{
    int tid;
    int startValue, endValue, inc;
    double z;


    public Mythread(int id, int sv, int ev){
        this.tid =id;
        this.startValue = sv;
        this.endValue = ev;
        inc = 3;
        z= 1.0;
    }

    @Override
    public void run() {
        for (int i = startValue; i<=endValue;i+=inc){
            z = z*(1.0/i);
        }
    }

    public double getZ() {
        return z;
    }
}

public class Test17 {
    public static void main(String[] args) {
        Thread t1 = new  Mythread(1,5,14);
        Thread t2 = new Mythread(2, 17, 26);
        Thread t3 = new Mythread(3, 29, 38);
        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        double r1 = ((Mythread)t1).getZ();
        double r2 = ((Mythread)t2).getZ();
        double r3 = ((Mythread)t3).getZ();

        double finalz = r1*r2*r3;
        System.out.println("Final z: "+finalz);
    }
}