package Bank;

public class AccountAltering{
    
    public double withdraw(double amount, double balance) throws Exception{
        if(amount <= 0){
            throw new Exception("Unable to withdraw a negative amount");
        }else if(amount > balance){
            throw new Exception("Insufficient funds!");
        }
        return balance -= amount;
    }
    
    public double deposit(double amount, double balance) throws Exception{
        if(amount <= 0){
            throw new Exception("Unable to deposit a negative amount");
        }
        return balance += amount;
    }
}
