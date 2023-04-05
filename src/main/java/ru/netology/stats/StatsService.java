package ru.netology.stats;

public class StatsService {
    public int minSalesInMonth(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSalesInMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int salesPerMonth(int[] sales) {
        int perMonth = 0;
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum / sales.length;
    }

    public int allSales(int[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; ++i)
            sum += sales[i];
        return sum;
    }


    public int monthsInWhichSalesWereBelowAverage(int[] sales) {
        int sum = 0;
        int average = salesPerMonth(sales);

        for (int i : sales) {
            if (i < average) {
                sum += 1;
            }

        }
        return sum;
    }

    public int monthInWhichSalesWereAboveAverage(int[] sales) {
        int sum = 0;
        int average = salesPerMonth(sales);

        for (int i : sales) {
            if (i > average) {
                sum += 1;
            }
        }
        return sum;
    }
}



