package ru.netology.stats;

public class StatsService {
    public int calcSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageMonthlySales(int[] sales) {
        int averageSale = calcSum(sales) / sales.length;
        return averageSale;
    }


    public int theMonthWithThePeakOfSales(int[] sales) {
        int peakOfSales = peakOfSales(sales);
        int theMonthWithThePeakOfSales;
        int monthCount = 0;
        theMonthWithThePeakOfSales = 0;
        for (int sale : sales) {
            monthCount++;
            if (peakOfSales == sale) {
                theMonthWithThePeakOfSales = monthCount;
            }

        }


        return theMonthWithThePeakOfSales;
    }

    private int peakOfSales(int[] sales) {
        int peakOfSales = sales[0];
        int theMonthWithThePeakOfSales = 0;
        for (int sale : sales) {
            if (sale > peakOfSales) {
                peakOfSales = sale;

            }
        }
        return peakOfSales;
    }


    public int theMonthWithMinimumSales(int[] sales) {
        int minimumSales = minimumSales(sales);
        int theMonthWithMinimumSales;
        int monthCount = 0;
        theMonthWithMinimumSales = 0;
        for (int sale : sales) {
            monthCount++;
            if (minimumSales == sale) {
                theMonthWithMinimumSales = monthCount;
            }

        }


        return theMonthWithMinimumSales;
    }

    private int minimumSales(int[] sales) {
        int minimumSales = sales[0];
        int theMonthWithMinimumSales = 0;
        for (int sale : sales) {
            if (sale < minimumSales) {
                minimumSales = sale;

            }
        }
        return minimumSales;
    }

    public int maxMonthSales(int[] sales) {
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


    public int minMonthSales(int[] sales) {
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

