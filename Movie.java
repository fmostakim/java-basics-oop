// প্রদত্ত MovieTheater class 
class MovieTheater {
    int availableSeats;
    MovieTheater(int s){
        availableSeats = s;
    }

    // synchronized method হওয়ায়, যেকোনো মুহূর্তে শুধু একটি thread
    // এই method-টি execute করতে পারবে।
    public synchronized int bookTickets(int numOFseats){
        int numOfTicketsBooked = 0;

        // (এই লাইনটি output বোঝার সুবিধার জন্য যোগ করা)
        System.out.println(Thread.currentThread().getName() + " is trying to book " + numOFseats + " tickets.");

        // The tickets are booked one by one
        for(int i=1; i<= numOFseats; i++){
            if(availableSeats > 0){
                availableSeats--;
                numOfTicketsBooked++;
            } else {
                break; // আর সিট খালি নেই
            }
        }
        return numOfTicketsBooked;
    }
}

// "User" thread class, "Thread" class কে extends করে 
class User extends Thread {
    MovieTheater m; // [cite: 30]
    int NumOfTickets; // [cite: 31]

    // Constructor 
    public User(MovieTheater m, int NumOfTickets, String name) {
        super(name); // Thread-এর নাম parent class-কে pass করা
        this.m = m;
        this.NumOfTickets = NumOfTickets;
    }

    // run method 
    @Override
    public void run() {
        // bookTickets method-কে call করা
        int booked = m.bookTickets(NumOfTickets);
        System.out.println(this.getName() + " has booked " + booked + " tickets");
    }
}

// "Movie" class with main method [cite: 36]
 class Movie1 {
    public static void main(String[] args) {

        // 15 টি সিট দিয়ে MovieTheater object তৈরি 
        MovieTheater theater = new MovieTheater(15);

        // 3 টি User thread তৈরি করা 
        // তিনটি thread-ই *একই* theater object ব্যবহার করছে
        User mina = new User(theater, 6, "Mina");
        User nabil = new User(theater, 8, "Nabil");
        User farhan = new User(theater, 4, "Farhan");

        // Thread-গুলো start করা 
        mina.start();
        nabil.start();
        farhan.start();

        // main thread-কে user thread-গুলোর কাজ শেষ 
        // না হওয়া পর্যন্ত অপেক্ষা করানো (join)
        try {
            mina.join();
            nabil.join();
            farhan.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // সব booking শেষ হলে remaining seats print করা 
        System.out.println("Available tickets:" + theater.availableSeats);
    }
}