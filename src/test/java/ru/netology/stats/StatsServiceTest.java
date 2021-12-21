package ru.netology.stats;

import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    private StatsService service = new StatsService();
    private int[] manegerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @org.junit.jupiter.api.Test
    void shouldCalcSum() {
        int expected = 180;
        int actual = service.calcSum(manegerSales);
        assertEquals(expected, actual);

    }

    @Test
    void shouldAverageMonthlySales() {
        int expected = 15;
        int actual = service.averageMonthlySales(manegerSales);
        assertEquals(expected, actual);
    }


    @Test
    void shouldTheMonthWithThePeakOfSales() {
        int expected = 8;
        int actual = service.theMonthWithThePeakOfSales(manegerSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldTheMonthWithMinimumSales() {
        int expected = 9;
        int actual = service.theMonthWithMinimumSales(manegerSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxMonthSales() {
        int expected = 8;
        int actual = service.maxMonthSales(manegerSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMinMonthSales() {
        int expected = 9;
        int actual = service.minMonthSales(manegerSales);
        assertEquals(expected, actual);
    }
}