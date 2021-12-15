package ru.netology.stats;

import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalcSum() {
        StatsService service = new StatsService();
        int[] manegerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.shouldСalcSum(manegerSales);
        assertEquals(expected, actual);

    }

    @Test
    void shouldAverageMonthlySales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.shouldAverageMonthlySales(sales);

        assertEquals(expected, actual);
    }


    @Test
    void shouldTheMonthWithThePeakOfSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 2;

        int actual = service.shouldTheMonthWithThePeakOfSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldTheMonthWithMinimumSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.shouldTheMonthWithMinimumSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.shouldMaxMonthSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMinMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.shouldMinMonthSales(sales);

        assertEquals(expected, actual);
    }
}