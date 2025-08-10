class Calculator{
    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public double divide(double a, double b){
        return a/b;
    }
}

public class TestCalculator{
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();

        System.out.println("Addition: "+ myCalc.add(10,5));
        System.out.println("Subtraction: " + myCalc.subtract(10, 5));
        System.out.println("Multiplication: "+ myCalc.multiply(10, 5));
        System.out.println("Division: "+ myCalc.divide(10, 5));
    }
}