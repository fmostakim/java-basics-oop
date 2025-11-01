import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class  Student {
    String name;
    int id;
    double cgpa;

    Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

     @Override
     public String toString() {
         return "Name: "+name+", id: "+id+", Cgpa: "+cgpa;
     }
 }
 class arrayList{
     public static void main(String[] args) {
         ArrayList<Student> studentArrayList = new ArrayList<>();

         studentArrayList.add(new Student(01, "Tawhid", 3.55));
         studentArrayList.add(new Student(02, "Imran", 3.65));
         studentArrayList.add(new Student(03, "Ramim", 3.45));
         studentArrayList.add(new Student(04, "Sakib", 3.75));


         Collections.sort(studentArrayList,new Comparator<Student>(){
             public int compare(Student s1, Student s2){
                 return Double.compare(s2.cgpa, s1.cgpa);
             }
         });

         for(Student st: studentArrayList){
             System.out.println(st);
         }


         System.out.println("Highest: "+studentArrayList.get(0));
         System.out.println("Lowest: "+studentArrayList.get(studentArrayList.size()-1));

     }
 }
