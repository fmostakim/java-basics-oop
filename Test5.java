 class DemoClass {

    // PI ভেরিয়েবলটি বাইরের ক্লাসেই থাকছে (final সহ)
    private final double PI = 3.1416;

    // ১. একটি non-static inner class তৈরি করা হলো
    class AreaCalculator {

        // ২. calculateArea() মেথডটিকে inner class-এর ভেতরে মুভ করা হলো
        void calculateArea(double radius) {

            // Inner class বাইরের ক্লাসের private 'PI' ভেরিয়েবলটি
            // সরাসরি অ্যাক্সেস করতে পারছে।
            double area = PI * radius * radius;
            System.out.println("Area: " + area);
        }
    }

    public static void main(String[] args) {

        // ৩. main থেকে কল করার প্রক্রিয়া:

        // ধাপ ১: বাইরের ক্লাসের (DemoClass) অবজেক্ট তৈরি করা
        DemoClass outerObj = new DemoClass();

        // ধাপ ২: বাইরের অবজেক্টের মাধ্যমে ভেতরের ক্লাসের (AreaCalculator) অবজেক্ট তৈরি করা
        // সিনট্যাক্সটি লক্ষ করুন: outerObj.new AreaCalculator()
        DemoClass.AreaCalculator innerObj = outerObj.new AreaCalculator();

        // ধাপ ৩: ভেতরের অবজেক্টের মাধ্যমে মেথড কল করা
        innerObj.calculateArea(5.0);
    }
}