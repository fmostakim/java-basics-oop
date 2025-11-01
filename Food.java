public class Food {
    String name;
    double price;

    public Food(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return " name= "+name+", price= "+price;
    }
}
