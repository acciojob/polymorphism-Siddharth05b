package com.driver.test;

import static org.junit.Assert.*;

import com.driver.Product;
import org.junit.jupiter.api.Test;

public class TestCases {
    @Test
    public void testProductWithIntegers() {
        Product p = new Product();

        int result1 = p.product(2, 3);
        assertEquals(6, result1);

        int result2 = p.product(2, 3, 4);
        assertEquals(24, result2);
    }

    @Test
    public void testProductWithDoubles() {
        Product p = new Product();

        double result = p.product(2.0, 3.0);
        assertEquals(6.0, result, 0.0001); // Using delta for double comparison
    }
}
