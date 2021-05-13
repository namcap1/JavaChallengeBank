package Bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountControllerTest{      
    @Test void accountOpenShouldBeDeafultFalse(){
        AccountController classUnderTest = new AccountController();
        assertEquals(classUnderTest.getOpen(), false);
    }
    @Test void canOpenAccount(){
        AccountController classUnderTest = new AccountController();
        try{
            classUnderTest.setOpen();
            assertEquals(classUnderTest.getOpen(), true);
        }catch(Exception e){
            System.err.println(e);
        }
        
    }
    @Test void canCloseAnAccount(){
        AccountController classUnderTest = new AccountController();
        try{
            classUnderTest.setOpen();
            classUnderTest.setClose();
            assertEquals(classUnderTest.getOpen(), false);
        }catch(Exception e){
            System.err.println(e);
        }
    }
    @Test void canDepositFromAnAccount(){
        AccountController classUnderTest = new AccountController();
        try{
            classUnderTest.setOpen();
            classUnderTest.deposit("20/02/2020", 10.00);
            System.out.println(classUnderTest.getBalance());
            assertEquals(classUnderTest.getBalance(), 10.00);
        }catch(Exception e){
            System.err.println(e);
        }
    }
    @Test void canWithdrawFromAnAccount(){
        AccountController classUnderTest = new AccountController();
        try{
            classUnderTest.setOpen();
            classUnderTest.deposit("20/02/2020", 10.00);
            classUnderTest.withdraw("21/02/2020", 5.00);
            assertEquals(classUnderTest.getBalance(), 5.00);
        }catch(Exception e){
            System.err.println(e);
        }
    }

    @Test void canPrintToConsole(){
        AccountController classUnderTest = new AccountController();
        try{
            classUnderTest.setOpen();
            classUnderTest.deposit("20/02/2020", 10.00);
            classUnderTest.withdraw("21/02/2020", 5.00);
            classUnderTest.print();
        }catch(Exception e){
            System.err.println(e);
        }
    }
}
