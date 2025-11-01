class InsufficientBalance extends Exception{
    public InsufficientBalance(double currentBalance, double withdrawAmount) {
        super("Insufficient Balance. Current balance " + currentBalance + " is lower than the withdraw amount" + withdrawAmount);
    }
}

class Account{
    private String name;
    private double balance;

    public Account(String name , double initialBalance){
        this.name = name;
        this.balance = initialBalance;
    }


    public void withdraw(double amount) throws InsufficientBalance{
        if(amount<=balance){
            balance -= amount;
        }else {
            throw new InsufficientBalance(this.balance,amount);
        }
    }
    public double getBalance(){
        return balance;
    }
    public String getName(){
        return  name;
    }
}

public class Test2 {
    public static void main(String[] args) {
        Account myAccount = new Account("Mr. Sadik", 100);


        try {
            myAccount.withdraw(40);
        }catch (InsufficientBalance e){
            System.err.println(e.getMessage());
        }
    }
}