package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSumSales() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.sumSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAvgSales() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.avgSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMaxSale() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 6;

        int actual = service.maxSale(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMinSale() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSale(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateCountMonthSaleLessAvg() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.counterMonthLessAvg(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateCountMonthSaleMoreAvg() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.counterMonthMoreAvg(sales);

        assertEquals(expected, actual);
    }
}