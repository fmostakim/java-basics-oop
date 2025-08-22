package Lab_CT.Game1;

public class GameArena {
    public static void main(String[] args){
        GameCharacter hero = new GameCharacter("Mostakim the Hero", 20);
        GameCharacter villain = new GameCharacter("Shimul the Orc", 15);

        System.out.println("\nTotal characters in the arena: "+GameCharacter.getCharecterCount()+"\n");
        System.out.println("Let the battle begin!  fight!!!!\n");
        hero.displayStats();
        villain.displayStats();

        System.out.println("---Round 1----");
        hero.attack(villain);
        villain.attack(hero);
        hero.displayStats();
        villain.displayStats();

        System.out.println("\n---Round 2 ---\n");
        hero.attack(villain);
        villain.attack(hero);
        hero.displayStats();
        villain.displayStats();


        System.out.println("\n----Round 3----\n");
        hero.attack(villain);
        villain.attack(hero);
        hero.displayStats();
        villain.displayStats();

        System.out.println("\n----Round 4-----\n");
        hero.attack(villain);
        villain.attack(hero);
        hero.displayStats();
        villain.displayStats();

        System.out.println("\n----Final Round-----");
        hero.attack(villain);

        System.out.println("\n----FINAL STATS----");
        hero.displayStats();
        villain.displayStats();

    }
}
