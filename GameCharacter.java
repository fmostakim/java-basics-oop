package Lab_CT.Game1;

public class GameCharacter {
    private String name;
    private int health;
    private int attackPower;

    private static int charecterCount = 0;
    public GameCharacter(String name, int attackPower){
        this.name=name;
        this.attackPower =attackPower;
        this.health = 100;
        charecterCount++;
        System.out.println(this.name +" has entered the arena!");
    }

    public boolean isAlive(){
        return this.health > 0;
    }
    public void attack(GameCharacter opponent){
        if(this.isAlive() && opponent.isAlive()){
            System.out.println(this.name+" attacks "+opponent.name+" with "+this.attackPower+" damage!");
            opponent.health -=this.attackPower;

            if(!opponent.isAlive()){
                System.out.println(opponent.name+" has been defeated! "+this.name+" is the winner!");

            }
        }else {
            System.out.println("The fight is already over!");
        }
    }
    public void displayStats(){
        System.out.println("---Stats for "+name+"-----");
        System.out.println("Health: "+(this.isAlive()? this.health : "Defeated"));
        System.out.println("Attack Power: "+attackPower);
        System.out.println("---------------------");
    }
    public static int getCharecterCount(){
        return charecterCount;
    }
}
