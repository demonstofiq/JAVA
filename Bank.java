package Lab2;

public class Bank {
    private double amount;

    
    public Bank(double amount) {
        this.amount = amount;
    }

 
    public void withdraw(double withdrawalAmount) {
        String message = (amount >= withdrawalAmount) ? 
            "Withdraw successful" : 
            "Insufficient balance";
        System.out.println(message);

        if (amount >= withdrawalAmount) {
            amount -= withdrawalAmount; 
        }
    }

    public void deposit(double depositAmount) {
        amount += depositAmount;
    }

   
    public void displayBalance() {
        System.out.println("Total balance: " + amount);
    }

    
    
    public static void main(String[] args) {
        
        Bank account = new Bank(10000);

     
        account.withdraw(10000);

     
        account.deposit(1000);

        
        account.displayBalance();
    }
}
