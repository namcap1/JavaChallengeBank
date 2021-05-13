package Bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrintStatementTest {
    @Test void printStatementAtLeastReturnsTheTopOfTheStatement(){
        PrintStatement classUnderTest = new PrintStatement();
        assertEquals(classUnderTest.print(), "date || credit || debit || balance\n");
    }
    @Test void canDepositMoneyAndItAddsToTheCorrectPrintStatementAndItPrints(){
        PrintStatement classUnderTest = new PrintStatement();
        classUnderTest.update("20/02/20", 100.00, 100.00);
        assertEquals(classUnderTest.print(), "date || credit || debit || balance\n20/02/20 || 100.00 || || 100.00\n");
    }
    @Test void canWithdrawMoneyAndItAddsToTheCorrectPrintStatementAndItPrints(){
        PrintStatement classUnderTest = new PrintStatement();
        classUnderTest.update("20/02/20", -100.00, 100.00);
        assertEquals(classUnderTest.print(), "date || credit || debit || balance\n20/02/20 || || 100.00 || 100.00\n");
    }
    @Test void printsInReverseOrder(){
        PrintStatement classUnderTest = new PrintStatement();
        classUnderTest.update("20/02/20", 100.00, 100.00);
        classUnderTest.update("21/02/20", -100.00, 100.00);
        assertEquals(classUnderTest.print(), "date || credit || debit || balance\n21/02/20 || || 100.00 || 100.00\n20/02/20 || 100.00 || || 100.00\n");
    }
}
