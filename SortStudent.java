import java.util.ArrayList;
import java.util.Comparator;
class Student{
    String name;
    String id;

    public Student(String name, String id){
        this.name = name;
        this.id = id;
    }
    public String getId(){
        return id;
    }

    public String toString(){
        return "name: "+name+", id = "+id;
    }
}

public class SortStudent {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Rahim", "101"));
        studentList.add(new Student("Karim", "108"));
        studentList.add(new Student("Mina", "123"));
        studentList.add(new Student("Raju", "119"));
        studentList.add(new Student("Sonia", "105"));

        System.out.println("Before sorting: ");
        for(Student s : studentList){
            System.out.println(s);
        }

        studentList.sort(new Comparator<Student>(){
            public int compare(Student s1,Student s2){
                String id1 = s1.getId();
                String id2 = s2.getId();

                char lastChar1 = id1.charAt(id1.length()-1);
                char lastChar2 = id2.charAt(id2.length()-1);
//
//                int lastDigit1 = Character.getNumericValue(lastChar1);
//                int lastDigit2 = Character.getNumericValue(lastChar2);
                int lastDigit1 = Integer.parseInt(""+lastChar1);
                int lastDigit2 = Integer.parseInt(""+lastChar2);

                return Integer.compare(lastDigit2, lastDigit1);
            }
        });

        System.out.println("After sorting: \n");
        for(Student s : studentList){
            System.out.println(s);
        }



    }
}
