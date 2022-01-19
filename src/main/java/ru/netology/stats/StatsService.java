package ru.netology.stats;

public class StatsService {
    public int calcSum(int[] sales) { //сумма всех продаж
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageMonthlySales(int[] sales) { //средняя сумма продаж в месяц
        int averageSale = calcSum(sales) / sales.length;
        return averageSale;
    }


    public int theMonthWithThePeakOfSales(int[] sales) { //Номер месяца, в котором был максимум продаж
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


    public int theMonthWithMinimumSales(int[] sales) { //Номер месяца, в котором был минимум продаж
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

    public int lowerAverage(int[] sales) {  // Кол-во месяцев, в которых продажи были ниже среднего
        int average = averageMonthlySales(sales);
        int numberMonth = 0;
        for (int sale : sales) {
            if (sale < average) {
                numberMonth++; //счетчик
            }
        }
        return numberMonth;
    }
    public int upperAverage(int[] sales) {  //Кол-во месяцев, в которых продажи были выше среднего
        int average = averageMonthlySales(sales);
        int numberMonth = 0;
        for (int sale : sales) {
            if (sale > average) {
                numberMonth++;
            }
        }
        return numberMonth;
    }
}

