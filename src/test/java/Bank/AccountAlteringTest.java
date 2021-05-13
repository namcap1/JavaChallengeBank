package Bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountAlteringTest{
    @Test void canWithdrawAPositiveAmountLessThanTheBalance(){
        AccountAltering classUnderTest = new AccountAltering();
        try{
            assertEquals(classUnderTest.withdraw(10.00, 50.00), 40.00);
        }catch(Exception e){
            System.err.println(e);
        }    
    }
    @Test void cannotWithdrawANegativeAmount(){
        AccountAltering classUnderTest = new AccountAltering();
        Throwable exception = assertThrows(Exception.class, () -> {
            classUnderTest.withdraw(-1.00, 0.00);
        });
        assertEquals("Unable to withdraw a negative amount", exception.getMessage());
    }
    @Test void cannotWithdrawZero(){
        AccountAltering classUnderTest = new AccountAltering();
        Throwable exception = assertThrows(Exception.class, () -> {
            classUnderTest.withdraw(0.00, 0.00);
        });
        assertEquals("Unable to withdraw a negative amount", exception.getMessage());
    }
    @Test void cannotWithdrawMoreThanTheBalance(){
        AccountAltering classUnderTest = new AccountAltering();
        Throwable exception = assertThrows(Exception.class, () -> {
            classUnderTest.withdraw(10.00, 0.00);
        });
        assertEquals("Insufficient funds!", exception.getMessage());
    }
    @Test void cannotDepositANegativeAmount(){
        AccountAltering classUnderTest = new AccountAltering();
        Throwable exception = assertThrows(Exception.class, () -> {
            classUnderTest.deposit(-1.00, 0.00);
        });
        assertEquals("Unable to deposit a negative amount", exception.getMessage());
    }
    @Test void cannotDepositZero(){
        AccountAltering classUnderTest = new AccountAltering();
        Throwable exception = assertThrows(Exception.class, () -> {
            classUnderTest.deposit(0.00, 0.00);
        });
        assertEquals("Unable to deposit a negative amount", exception.getMessage());
    }
    @Test void canDepositMoney(){
        AccountAltering classUnderTest = new AccountAltering();
        try{
            assertEquals(classUnderTest.deposit(10, 0), 10.00);
        }catch(Exception e){
            System.err.println(e);
        }
    }
}