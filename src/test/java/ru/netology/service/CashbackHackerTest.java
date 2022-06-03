package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackerTest {

    CashbackHacker cashbackHacker = new CashbackHacker();

    @Test
    public void cashbackl() {

        int expected = 100;
        int actual = cashbackHacker.remain(900);
        assertEquals(actual, expected);
    }

    @Test
    public void cashbackLimit() {
        int expected = 1000;
        int actual = cashbackHacker.remain(0);

        assertEquals(actual, expected);

    }


}