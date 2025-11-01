import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
//class Employ implements Comparable<Employ>{
//    String name;
//    int salary;
//
//    public Employ(String name, int salary){
//        this.name = name;
//        this.salary = salary;
//    }
//
//    public int compareTo(Employ o){
//        return this.name.compareTo(o.name);
//    }
//
//    public String toString(){
//        return "name: "+name+", salary: "+salary;
//    }
//}
//
//class Main5{
//    public static void main(String[] args) {
//        ArrayList<Employ> employsList = new ArrayList<>();
//
//        employsList.add(new Employ("Dulia", 50000));
//        employsList.add(new Employ("Mostakim", 500000));
//        employsList.add(new Employ("Bonna", 40000));
//
//        Collections.sort(employsList);
//        for(Employ e : employsList){
//            System.out.println(e);
//        }
//
//
//    }
//}



class Employ{
    String name;
    int salary;

    public Employ(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return "Name: "+name+", Salary: "+salary;
    }
}
class Mainother{
    public static void main(String[] args) {
        ArrayList<Employ> employList = new ArrayList<>();
        employList.add(new Employ("Sami", 120000));
        employList.add(new Employ("Kafi", 150000));
        employList.add(new Employ("Mostakim", 250000));

        employList.sort(new Comparator<Employ>(){
            public int compare(Employ e1, Employ e2){
                return Integer.compare(e2.salary, e1.salary);
            }
        });

        for (Employ e : employList){
            System.out.println(e);
        }
    }
}