public class Cat extends Animal implements Pet{
    public void miau(){
        System.out.println("Miau miau!");
    }
    @Override
    public void makeSound(){
        System.out.println("The cat meaus: Miau miau!");
    }

    @Override
    public void beFriendly(){
        System.out.println("The cat is so cute.");
    }

    @Override
    public void play(){
        System.out.println("The cat is playing with a yarn ball.");
    }
}