public class TestAnimal {
    public static void main(String[] args) {

        Animal generAnimal = new Animal();

        Cat myCat = new Cat();
        myCat.name = "Tom";


        generAnimal.makeSound();
        myCat.makeSound();
        myCat.eat();

        // Dog myDog = new  Dog();
        // myDog.name = "Buddy";
        // myDog.eat();
        // myDog.bark();
    }
}