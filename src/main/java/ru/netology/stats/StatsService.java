package ru.netology.stats;

public class StatsService {
    public int shouldСalcSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int shouldAverageMonthlySales(int[] sales) {
        int averageSale = shouldСalcSum(sales) / sales.length;
        return averageSale;
    }


    public int shouldTheMonthWithThePeakOfSales(int[] sales) {
        int peakOfSales = sales[6];
        for (int sale : sales) {
            if (sale > peakOfSales) {
                peakOfSales = sale = 1;
                peakOfSales++;

            }
        }
        return peakOfSales;
    }

    public int shouldTheMonthWithMinimumSales(int[] sales) {
        int peakOfSales = sales[0];
        for (int sale : sales) {
            if (sale < peakOfSales) {
                peakOfSales = sale;
                peakOfSales += 2;

            }
        }
        return peakOfSales;
    }

    public int shouldMaxMonthSales(int[] sales) {
        int currentMaxSalesMonth = 1;
        int currentMax = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] >= currentMax) {
                currentMax = sales[i];
                currentMaxSalesMonth = i + 1;
            }
        }
        return currentMaxSalesMonth;
    }


    public int shouldMinMonthSales(int[] sales) {
        int currentMinSalesMonth = 1;
        int currentMin = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] <= currentMin) {
                currentMin = sales[i];
                currentMinSalesMonth = i + 1;
            }
        }
        return currentMinSalesMonth;
    }
}

