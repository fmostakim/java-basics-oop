public class Operator{
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("a+b = "+(a+b));
        System.out.println("a-b = "+(a-b));
        System.out.println("a/b = "+(a/b));
        System.out.println("a%b = "+(a%b));

        System.out.println("a == b "+(a==b));
        System.out.println("a>b = "+(a>b));

        int age = 22;
        boolean hasLicense = true;
        System.out.println("Can drive? "+ (age> 18 && hasLicense));

        System.out.println("Is child or no license? "+ (age < 18 || !hasLicense));
    }
}