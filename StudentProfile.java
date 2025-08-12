import java.util.Scanner;

public class StudentProfile{
    public static void main(String[] args) {
        
        int studentId;
        String studentName;
        double studentCgpa;
        boolean isRegularStudent;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your ID: ");
        studentId = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter your name: ");
        studentName = scanner.nextLine();

        

        System.out.print("Enter your Cgpa: ");
        studentCgpa = scanner.nextDouble();

        System.out.print("Are you currently student: ");
        isRegularStudent = scanner.nextBoolean();

        System.err.println("Your student id is "+studentId);
        System.out.println("Your name is "+studentName);
        System.err.println("Your cgpa is "+studentCgpa);
        System.err.println("You are a student-"+isRegularStudent);
        


        
    }
}