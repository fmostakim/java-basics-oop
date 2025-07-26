public class Cat extends Animal{
    public void bark(){
        System.out.println("Miau miau!");
    }
    @Override
    public void makeSound(){
        System.out.println("The cat barks: Miau miau!");
    }
}