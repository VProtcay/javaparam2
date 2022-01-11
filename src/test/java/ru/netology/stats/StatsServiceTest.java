package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    public void shouldSumMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.sumMonth(sales);
        int expected = 180;
        assertEquals(expected, actual);

    }

    @Test
    public void shouldFindAvg() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findAvg(sales);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMax() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maxMonth(sales);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMin() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minMonth(sales);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindUnderAvg() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.underAvg(sales);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindOverAvg() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.overAvg(sales);
        int expected = 5;
        assertEquals(expected, actual);
    }
}