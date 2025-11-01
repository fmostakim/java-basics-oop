public class Test {

    // Removed unreachable code
    int TestA() throws Exception {
        throw new Exception("Exception has been thrown from TestA");
    }

    // Added "throws Exception" to the method signature
    void TestB() throws Exception {
        int a = TestA();

        if (a == 0) {
            System.out.println("Exception in TestB: a is zero.");
        } else {
            System.out.println("You should figure out the value of a: " + a);
            throw new Exception("Exception from else clause in TestB");
        }
        return;
    }

    boolean TestC(boolean val) throws Exception {
        if (val == false) {
            throw new Exception("Exception in TestC");
        }
        return false;
    }

    public static void main(String[] args) {
        // Creating an instance to call non-static methods
        Test testObj = new Test();
        try {
            testObj.TestC(false);
        } catch (Exception e) {
            System.out.println(e);
            try {
                testObj.TestB();
            } catch (Exception e1) {
                System.out.println(e1);
            }
        }
    }
}