package Bank;

import java.util.ArrayList;

public class PrintStatement {

    private ArrayList<String> record;

    PrintStatement(){
        this.record = new ArrayList<String>();
    }
    
    public void update(String date, double amount, double balance){
        if(amount < 0){
            amount *= -1;
            String temp = String.format("%s || || %.2f || %.2f\n", date, amount, balance);
            this.record.add(temp);
        }else{
            String temp = String.format("%s || %.2f || || %.2f\n", date, amount, balance);
            this.record.add(temp);
        }
    }

    public String print(){
        String ans = "date || credit || debit || balance\n";
        for(int i = this.record.size() -1; i>=0; i--){
            ans += this.record.get(i);
        }
        return ans;
    }
}
