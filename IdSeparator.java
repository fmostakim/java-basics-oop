import java.io.*;


 public class IdSeparator {
    public static void main(String[] args) {
        // try-with-resources ব্লক ব্যবহার করা হয়েছে ताकि ফাইলগুলো কাজ শেষে নিজে থেকেই বন্ধ হয়ে যায়
        try (BufferedReader reader = new BufferedReader(new FileReader("id.txt"));
             BufferedWriter oddWriter = new BufferedWriter(new FileWriter("odd.txt"));
             BufferedWriter evenWriter = new BufferedWriter(new FileWriter("even.txt"))) {

            String line;
            System.out.println("Reading from id.txt using BufferedReader...");

            // ফাইলের শেষ পর্যন্ত লাইন বাই লাইন পড়া
            // reader.readLine() যখন ফাইলের শেষে পৌঁছে যায়, তখন null রিটার্ন করে
            while ((line = reader.readLine()) != null) {
                // খালি লাইন থাকলে যেন এরর না হয়
                if (line.trim().isEmpty()) {
                    continue;
                }

                long id = Long.parseLong(line); // স্ট্রিং আইডিকে long নাম্বারে রূপান্তর

                if (id % 2 == 0) {
                    evenWriter.write(line); // জোড় আইডি even.txt-এ লেখা
                    evenWriter.newLine();   // একটি নতুন লাইন যোগ করা
                } else {
                    oddWriter.write(line);  // বিজোড় আইডি odd.txt-এ লেখা
                    oddWriter.newLine();    // একটি নতুন লাইন যোগ করা
                }
            }
            System.out.println("Task completed successfully!");

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}