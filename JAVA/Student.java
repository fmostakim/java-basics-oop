public class Student {
    String name;
    int rollNumber;

    public Student(String studentName, int studentRoll){
        System.out.println("A new student object is being created...");
        name = studentName;
        rollNumber = studentRoll;
    }

    void displayInfo(){
        System.out.println("Name: "+name+", Roll: "+rollNumber);
    }
}
