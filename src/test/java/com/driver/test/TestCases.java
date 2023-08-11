package com.driver.test;

import static org.junit.Assert.*;

import com.driver.Main;
import org.junit.jupiter.api.Test;

public class TestCases {
    @Test
    public void testProductWithIntegers() {
        Main.Product p = new Main.Product();

        int result1 = p.product(2, 3);
        assertEquals(6, result1);

        int result2 = p.product(2, 3, 4);
        assertEquals(24, result2);
    }

    @Test
    public void testProductWithDoubles() {
        Main.Product p = new Main.Product();

        double result = p.product(2.0, 3.0);
        assertEquals(6.0, result, 0.0001); // Using delta for double comparison
    }
}
