/*
 * এই ফাইলটির নাম Competition.java দিয়ে সেভ করতে হবে,
 * কারণ public ক্লাসটির নাম Competition
 */

// Player ক্লাসটি Runnable interface ইমপ্লিমেন্ট করে
// এর মানে হলো, এই ক্লাসের অবজেক্টকে একটি থ্রেড (Thread) চালাতে পারবে
class Player implements Runnable {

    // প্রতিটি Player অবজেক্টের নিজস্ব একটি থ্রেড ভ্যারিয়েবল থাকবে
    Thread t;

    // Player-এর কনস্ট্রাক্টর (Constructor)
    // যখনই new Player("Cersei") কল করা হবে, এই মেথডটি চলবে
    Player(String name) {

        // 1. একটি নতুন থ্রেড অবজেক্ট তৈরি করা হচ্ছে
        // 'this' দিয়ে বোঝানো হচ্ছে এই Player অবজেক্টটিই হলো সেই "কাজ" (Runnable টাস্ক)
        // 'name' দিয়ে থ্রেডটির নাম সেট করা হচ্ছে (যেমন: "Cersei")
        t = new Thread(this, name);

        // 2. থ্রেডটি চালু করা হচ্ছে।
        // t.start() কল করার সাথে সাথে JVM নিজে থেকেই run() মেথডকে একটি
        // আলাদা থ্রেডে চালানো শুরু করে দেয়।
        t.start();
    }

    // run() মেথড হলো সেই মূল কাজ যা থ্রেডটি সম্পাদন করবে
    // Runnable ইমপ্লিমেন্ট করার কারণে এই মেথডটি লেখা বাধ্যতামূলক
    @Override
    public void run() {

        // t.getName() দিয়ে থ্রেডের নামটি (e.g., "Cersei") পাওয়া যায়
        String name = t.getName();

        System.out.println(name + " starts the race.");

        try {
            // ৩টি অবস্টাকল পার করার জন্য লুপ (i = 0, 1, 2)
            for (int i = 0; i < 3; i++) {
                System.out.println(name + " crossed " + i + " obstacle.");

                // থ্রেডটিকে অল্প সময়ের জন্য "ঘুম পাড়িয়ে" রাখা (0-199 মিলিসেকেন্ড)
                // এটি করলে অন্য থ্রেডগুলো চলার সুযোগ পায় (Thread Scheduling)।
                // একারণেই আউটপুটগুলো এলোমেলো বা মিশ্রিত (interleaved) দেখায়।
                Thread.sleep(200);
            }
        } catch (Exception e) {
            // যদি থ্রেডটি ঘুমানোর সময় কোনোভাবে বাধাপ্রাপ্ত (interrupted) হয়
            System.out.println(name + " was interrupted.");
        }

        // লুপ শেষ হলে রেস ফিনিশ দেখাবে
        System.out.println(name + " finishes the race.");
    }
}

// Competition ক্লাসে main মেথড আছে, যেখান থেকে প্রোগ্রাম শুরু হবে
 class Competition {

    public static void main(String[] args) {

        // তিনটি Player অবজেক্ট তৈরি করা হচ্ছে
        // অবজেক্ট তৈরি হওয়ামাত্রই তাদের কনস্ট্রাক্টর (Player constructor) কল হচ্ছে
        // এবং প্রতিটি Player-এর জন্য আলাদা আলাদা থ্রেড চালু হয়ে যাচ্ছে

        Player player1 = new Player("Cersei");
        Player player2 = new Player("Jamie");
        Player player3 = new Player("Tyrion");

        // main থ্রেডটির কাজ এখানে শেষ।
        // কিন্তু player1, player2, এবং player3 এর থ্রেডগুলো
        // ব্যাকগ্রাউন্ডে তাদের run() মেথড শেষ না হওয়া পর্যন্ত চলতে থাকবে।
    }
}