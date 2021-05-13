package Bank;

public class Main {
    public static void main(String[] args){
        AccountController account = new AccountController();
        try{
            account.setOpen();
            account.deposit("10/01/2012", 1000);
            account.deposit("13/01/2012", 2000);
            account.withdraw("14/01/2012", 500);
            account.print();
        }catch(Exception e){
            System.err.println(e);
        }
    }
}
