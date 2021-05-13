package Bank;

public class AccountController {
    private AccountOpen open;
    private AccountAltering alter;
    private Balance balance;
    private PrintStatement statement;
    
    AccountController(){
        this.open = new AccountOpen();
        this.alter = new AccountAltering();
        this.balance = new Balance();
        this.statement = new PrintStatement();
    }

    public boolean getOpen(){
        return this.open.getOpen();
    }

    public double getBalance(){
        return this.balance.getBalance();
    }
    
    public void setOpen()throws Exception{
        this.open.setOpen();
    }

    public void setClose()throws Exception{ 
        this.open.setClose();
        this.balance.setBalance(0);
    }

    public void withdraw(String date, double amount)throws Exception{
        if(this.open.getOpen()){
            double result = this.alter.withdraw(amount, this.balance.getBalance());
            this.balance.setBalance(result);
            this.statement.update(date, amount, this.balance.getBalance());
        }
    }
  
    public void deposit(String date, double amount)throws Exception{
        if(this.open.getOpen()){
            double result = this.alter.deposit(amount, this.balance.getBalance());
            this.balance.setBalance(result);
            this.statement.update(date, amount, this.balance.getBalance());
        }
    }
    
    public void print(){
        System.out.println(this.statement.print());
    }
}
