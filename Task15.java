// class SeriesCalculator implements Runnable {
//    private int start;
//    private int end;
//    private int sum;
//
//    public SeriesCalculator(int start, int end){
//        this.start = start;
//        this.end = end;
//        this.sum = 0;
//    }
//
//    public void run(){
//        for (int i = start;i<=end;i+=2){
//            sum+=i;
//        }
//    }
//    public int getSum(){
//        return sum;
//    }
//}
//class Main15{
//    public static void main(String[] args) {
//        SeriesCalculator s1 = new SeriesCalculator(0,50);
//        SeriesCalculator s2 = new SeriesCalculator(1,50);
//
//        Thread t1 = new Thread(s1);
//        Thread t2 = new Thread(s2);
//        t1.start();
//        t2.start();
//
//        try {
//            t1.join();
//            t2.join();
//            int total = s2.getSum()-s1.getSum();
//
//            System.out.println(total);
//        }catch (InterruptedException e){
//            System.out.println(e.getMessage());
//        }
//
//
//
//
//
//    }
//}

class positiveSeries implements Runnable{
    int positiveSum = 0;

    @Override
    public void run() {
        for (int i = 1;i<=50;i+=2){
            positiveSum+=i;
        }
    }

    public int getPositiveSum() {
        return positiveSum;
    }
}
class negativeSeries implements Runnable{
    int negativeSum = 0;
    @Override
    public void run() {
        for(int i = 2;i<=50;i+=2){
            negativeSum +=i;
        }
    }

    public int getNegativeSum(){
        return negativeSum;
    }
}

 class Main15 {
    public static void main(String[] args) {
        int totalSum ;
        positiveSeries p1 = new positiveSeries();
        negativeSeries n1 = new negativeSeries();

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(n1);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();



        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        int positiveSum = p1.getPositiveSum();
        int negativeSum = n1.getNegativeSum();

        totalSum = positiveSum - negativeSum;

        System.out.println("Positive sum: "+positiveSum);
        System.out.println("Negative sum: "+negativeSum);
        System.out.println(totalSum);

    }
}
