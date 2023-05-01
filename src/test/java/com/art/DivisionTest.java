package com.art;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    @Test
    void getName() {
        Division div = new Division("A");

        assertEquals("A", div.getName());
    }
    @Test
    void correctIdTest() {
        Division div = new Division("A");
        Division div1 = new Division("B");

        assertEquals(1, div1.getId());
    }
}