package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void shouldBe1000() {
        int result = Main.get1000();
        assertEquals(1000, result);
    }

    @Test
    void shouldBe1000again() {
        int result = Main.get1000();
        assertEquals(1000, result);
    }

    @Test
    void shouldBe1000again2() {
        int result = Main.get1000();
        assertEquals(1000, result);
    }
}
