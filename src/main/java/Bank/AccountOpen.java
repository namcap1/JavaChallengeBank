package Bank;

public class AccountOpen {
    private boolean open;

    AccountOpen(){
        this.open = false;
    }

    public boolean getOpen(){
        return this.open;
    }

    public void setOpen()throws Exception{
        if(this.open){
            throw new Exception("Account is already opened");
        }else{
            this.open = true;
        }
    }

    public void setClose()throws Exception{
        if(this.open){
            this.open = false;
        }else{
            throw new Exception("No account is open");
        }
    }
}
