public class CourseAnalytics {
    public static void main(String[] args) {
        // ৪ জন ছাত্রের ৫টি কোর্সের মার্কস
        int[][] studentMarks = {
            {75, 80, 85, 60, 90},  // ছাত্র ১
            {88, 92, 79, 95, 85},  // ছাত্র ২
            {98, 90, 92, 96, 89},  // ছাত্র ৩
            {65, 70, 55, 38, 75}   // ছাত্র ৪
        };

        System.out.println("--- Total Marks per Student ---");
        // পার্ট ১: প্রত্যেক ছাত্রের মোট মার্কস গণনা
        for (int i = 0; i < studentMarks.length; i++) {
            int total = 0;
            for (int j = 0; j < studentMarks[i].length; j++) {
                total += studentMarks[i][j]; // total = total + studentMarks[i][j]
            }
            // (i+1) ব্যবহার করা হয়েছে যাতে আউটপুট Student 1, Student 2 এভাবে দেখায়
            System.out.println("Student " + (i + 1) + " Total Marks: " + total);
        }

        System.out.println("\n--- Average Marks per Course ---");
        // পার্ট ২: প্রত্যেক কোর্সের গড় মার্কস গণনা
        for (int j = 0; j < studentMarks[0].length; j++) {
            double total = 0;
            for (int i = 0; i < studentMarks.length; i++) {
                total += studentMarks[i][j];
            }
            double average = total / studentMarks.length;
            System.out.println("Course " + (j + 1) + " Average Marks: " + average);
        }

        System.out.println("\n--- Printing Marks >= 40 ---");
        // পার্ট ৩: শুধুমাত্র পাস করা মার্কসগুলো (৪০ বা তার বেশি) প্রিন্ট করা
        for (int[] studentRow : studentMarks) {
            for (int mark : studentRow) {
                if (mark < 40) {
                    continue; // ৪০ এর কম পেলে এই মার্কটি প্রিন্ট না করে লুপ চলতে থাকবে
                }
                System.out.print(mark + " ");
            }
            System.out.println(); // প্রতি ছাত্রের পর একটি নতুন লাইন
        }
    }
}