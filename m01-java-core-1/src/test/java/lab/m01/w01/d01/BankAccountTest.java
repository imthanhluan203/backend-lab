package lab.m01.w01.d01;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
public class BankAccountTest {
    @Test
    void test1(){
        IllegalArgumentException test1 = assertThrows(IllegalArgumentException.class,
                ()->new BankAccount("","Thanh Luan", new BigDecimal(123.12)));
        assertTrue(test1.getMessage().contains("Id cannot empty"));
    }

    @Test
    void test2(){
        IllegalArgumentException test1 = assertThrows(IllegalArgumentException.class,
                ()->new BankAccount("123","", new BigDecimal(123.12)));
        assertTrue(test1.getMessage().contains("Owner cannot empty"));
    }

    @Test
    void test3(){
        IllegalArgumentException test1 = assertThrows(IllegalArgumentException.class,
                ()->new BankAccount("123","Thanh Luan", new BigDecimal(-123.12)));
        assertTrue(test1.getMessage().contains("Balance cannot negative"));
    }

    @Test
    void test4(){
        IllegalArgumentException test1 = assertThrows(IllegalArgumentException.class,
                ()->new BankAccount("123","Thanh Luan", new BigDecimal(123.12)).widthDraw(new BigDecimal(-10)));
        assertTrue(test1.getMessage().contains("Cannot widthrow negative number"));
    }

    @Test
    void test5(){
        InsufficientFundsException test1 = assertThrows(InsufficientFundsException.class,
                ()->new BankAccount("123","Thanh Luan", new BigDecimal(123.12)).widthDraw(new BigDecimal(1000)));
        assertTrue(test1.getMessage().contains("Cannot widthraw amount of money more than banlance"));

    }

    @Test
    void test6(){
        BigDecimal num = new BigDecimal(1000);
        BankAccount myBank = new BankAccount("01","Thanh Luan", new BigDecimal(1000));
        BigDecimal result = num.subtract(new BigDecimal(123.12));
        myBank.widthDraw(new BigDecimal(123.12));
        assertEquals(result,myBank.getBalance());
    }
}
