package Bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BalanceTest{
    @Test void balanceOnConstructShouldBeZero(){
        Balance classUnderTest = new Balance();
        assertEquals(classUnderTest.getBalance(), 0);
    }
    @Test void balanceCanIncreaseTheBalance(){
        Balance classUnderTest = new Balance();
        classUnderTest.setBalance(10.00);
        assertEquals(classUnderTest.getBalance(), 10.00);
    }
    @Test void balanceCanDecreaseTheBalance(){
        Balance classUnderTest = new Balance();
        classUnderTest.setBalance(10.00);
        classUnderTest.setBalance(5.00);
        assertEquals(classUnderTest.getBalance(), 5.00);
    }
}