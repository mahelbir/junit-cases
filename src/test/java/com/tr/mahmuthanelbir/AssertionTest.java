package com.tr.mahmuthanelbir;

import org.junit.Test;

import static org.junit.Assert.*;


public class AssertionTest {

    @Test()
    public void testEquals() {
        assertEquals(13, Main.return13());
    }

    @Test
    public void testNotEquals() {
        assertNotEquals("TEST", Main.returnStr());
    }

    @Test
    public void testNull() {
        assertNull("verilen input null değil", Main.returnNull());
    }

    @Test
    public void testNotNull() {
        assertNotNull("verilen input null", Main.returnStr());
    }

    @Test
    public void testTrue() {
        assertTrue(12 < Main.return13());
    }

    @Test
    public void testFalse() {
        assertFalse(16 < Main.return13());
    }

    @Test(expected = ArithmeticException.class)
    public void testExpectedClass() {
        int x = 1 / 0;
    }

    @Test(expected = java.lang.AssertionError.class)
    public void failMethodTest() {
        fail("bu method testi başarısız yapıyor fakat beklenen durum başarısız olduğu için test başarılı :)");
    }

}
