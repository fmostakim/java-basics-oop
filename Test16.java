class PsSeries extends Thread{
    double psSum = 0;
    double x;
    public PsSeries(double x){
        this.x = x;
    }
    @Override
    public void run() {
        for(int i = 0; i<=50;i+=2){
            psSum += Math.pow(x,i)/(i+1);
        }
    }

    public double getPsSum(){
        return psSum;
    }
}

class NsSeries extends Thread{
    double x;
    double nsSum=0;
    public NsSeries(double x){
        this.x = x;
    }

    @Override
    public void run() {
        for (int i = 1;i<=50;i+=2){
           nsSum += Math.pow(x,i)/(i+1);
        }
    }

    public double getNsSum() {
        return nsSum;
    }
}
class Main16{
    public static void main(String[] args) {
        PsSeries p = new PsSeries(1.15);
        NsSeries n = new NsSeries(1.15);

        p.start();
        n.start();

        try{
            p.join();
            n.join();

        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        double total = p.getPsSum()-n.getNsSum();

        System.out.println("Sum: "+total);
    }
}