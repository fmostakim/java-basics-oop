 class NumberPrinter implements Runnable {
    public void run(){
//        try{
            for (int i =0;i<=10;i++){
                System.out.println(i);
//                Thread.sleep(500);
            }
//        }catch (InterruptedException e){
//            System.out.println("Thread interrupted.");
//        }
    }
}
class Main2{
    public static void main(String[] args) {
        NumberPrinter numberTask = new NumberPrinter();
        Thread t1 = new Thread(numberTask);
        t1.start();

        try {
            t1.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Finished");
    }
}