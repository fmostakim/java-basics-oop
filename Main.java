package Lab_CT.Practice;

public class Main {
    public static void main(String[] args){
        UserProfile user1 = new UserProfile("Mostakim ", 22, "fokirmostakim10@gmail.com");
        System.out.println("---Initial Profile Info---");
        System.out.println("Username: "+user1.getUsername());
        System.out.println("Age: "+user1.getAge());
        System.out.println("Email: "+user1.getEmail());
        System.out.println("\n ---Updating Profile---");

        System.out.println("\nAttempting to change age...");
        user1.setAge(21);
        user1.setAge(-5);

        System.out.println("\nAttempting to change email...");
        user1.setEmail("mostakim@gmail.com");
        user1.setEmail("invalid-email");

        System.out.println("----Final Profile Info----");
        System.out.println("Username: "+user1.getUsername());
        System.out.println("Age: "+user1.getAge());
        System.out.println("Email: "+user1.getEmail());

    }
}
