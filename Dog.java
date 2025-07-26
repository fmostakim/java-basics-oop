public class Dog extends Animal implements Pet{

    @Override
    public void makeSound(){
        System.out.println("The dog barks: Woof woof!");
    }

    @Override
    public void beFriendly(){
        System.out.println("The dog wags its tail.");
    }

    @Override
    public void play(){
        System.out.println("The dog is playing fetch.");
    }
}