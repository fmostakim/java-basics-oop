public class Car {
    String color;
    String brand;

    public Car(String color, String brand){
        this.color = color;
        this.brand = brand;
    }


    void drive(){
        System.out.println("The "+color+" "+brand+" is driving.");
    }
}
