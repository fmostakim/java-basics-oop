package Lab_CT.Practice;

public class Shop {
    public static void main(String[] args){
        Product p1 = new Product("Laptop", 101, 75000.0);
        Product p2 = new Product("Mouse", 102, 1200);

        System.out.println("Initial product details: ");
        p1.displayDetails();
        p2.displayDetails();

        System.out.println("\nUpdating product details: ");
        p2.setPrice(1350.0);
        p1.setPrice(-5000);

        System.out.println("\nFinal product details: ");
        p1.displayDetails();
        p2.displayDetails();

        System.out.println("Total types of product in the shop: "+Product.getTotalProducts());
    }

}
