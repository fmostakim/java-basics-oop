package Lab_CT.Practice;

public class UserProfile {
    private String username;
    private int age;
    private String email;


    public UserProfile(String username, int age, String email){
        this.username = username;
        this.age = age;
        this.email = email;

    }
    public String getUsername(){
        return this.username;
    }
    public int getAge(){
        return this.age;
    }
    public String getEmail(){
        return this.email;
    }

    public void setUsername(String username){
        this.username = username;
    }
    public void setAge(int age){
        if(age>0 && age<120){
            this.age = age;
            System.out.println("Invalid age! Age must be a positive number and less than 120.");
        }
    }
    public void setEmail(String email){
        if(email != null && email.contains("@")){
            this.email = email;
            System.out.println("Email updated successfully to "+email);

        }else {
            System.out.println(" Invalid email format! Email must contain '@'.");
        }
    }
}
