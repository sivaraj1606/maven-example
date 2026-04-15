package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testDeposit() {
        App account = new App(500);
        account.deposit(200);
        assertEquals(700, account.getBalance());
    }

    @Test
    void testWithdraw() {
        App account = new App(1000);
        account.withdraw(300);
        assertEquals(700, account.getBalance());
    }

    @Test
    void testInsufficientBalance() {
        App account = new App(100);
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(200);
        });
    }
}
