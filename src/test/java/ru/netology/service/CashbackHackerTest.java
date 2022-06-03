package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackerTest  {
    
    CashbackHacker cashbackHacker = new CashbackHacker();

    @Test
    public void testRemain() {
         int expected = 100;
         int actual = cashbackHacker.remain(900);

         assertEquals(expected,actual);

    }

    @Test
    public void testRemainNull() {
        int expected = 1000;
        int actual = cashbackHacker.remain(0);

        assertEquals(expected,actual);

    }

    @Test
    public void testRemainUnderBoudaryLimit() {
        int expected = 1;
        int actual = cashbackHacker.remain(999);

        assertEquals(expected,actual);

    }

    @Test
    public void testRemainMoreLimit() {
        int expected = 0;
        int actual = cashbackHacker.remain(1000);

        assertEquals(expected,actual);

    }
}