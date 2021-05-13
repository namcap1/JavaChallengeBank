package Bank;

public class Balance{
    private double accountBalance;
    
    Balance(){
        this.accountBalance = 0.00;
    }

    public double getBalance(){
        return this.accountBalance;
    }

    public void setBalance(double amount){
        this.accountBalance = amount;
    }
}