package ru.netology;


import org.junit.jupiter.api.Test;
import ru.netology.service.CashbackHackService;

import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest{
    @Test
    public void testCash5000() {
        CashbackHackService cashbackHackServiceTest = new CashbackHackService();
        int amount = 5000;

        int expected = 0;
        int actual = cashbackHackServiceTest.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void testCash5600() {
        CashbackHackService cashbackHackServiceTest = new CashbackHackService();
        int amount = 5600;

        int expected = 400;
        int actual = cashbackHackServiceTest.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void testCash500() {
        CashbackHackService cashbackHackServiceTest = new CashbackHackService();
        int amount = 500;

        int expected = 500;
        int actual = cashbackHackServiceTest.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void testCash120() {
        CashbackHackService cashbackHackServiceTest = new CashbackHackService();
        int amount = 120;

        int expected = 880;
        int actual = cashbackHackServiceTest.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void testCash0() {
        CashbackHackService cashbackHackServiceTest = new CashbackHackService();
        int amount = 0;

        int expected = 1000;
        int actual = cashbackHackServiceTest.remain(amount);

        assertEquals(actual, expected);
    }
}