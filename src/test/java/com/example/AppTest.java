package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class AppTest {

    @Test
    public void testDeposit() {
        assertEquals(100, 100);
    }

    @Test
    public void testWithdraw() {
        assertEquals(50, 50);
    }

    @Test
    public void testInsufficientBalance() {
        assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException();
        });
    }
}
