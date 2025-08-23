package Lab_CT.Practice;

public class Product {
    private String productName;
    private  int productID;
    private double price;
    private static int totalProducts = 0;

    public Product(String productName, int  productID, double price){
        this.productName= productName;
        this.productID = productID;
        this.price = price;
        totalProducts++;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double newPrice){
        if (newPrice > 0){
            this.price = newPrice;
            System.out.println("Price for "+this.productName+" updated successfully");
        }else {
            System.out.println("Error: Invalid price. Price must be greater than 0...");
        }
    }
    public void displayDetails(){

        System.out.println("\nProduct ID: "+productID);
        System.out.println("Product Name: "+productName);
        System.out.println("Price: BDT "+price+"\n");

    }

    public static int getTotalProducts(){
        return totalProducts;
    }

}
