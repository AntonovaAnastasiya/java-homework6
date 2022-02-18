package ru.netology.stats;

public class StatsService {

    public int calculateSum (int[] sales) {
        int sum = 0;
        for (int sale : sales) {

            sum += sale;
        }
        return sum;
    }

    public int calcAvg(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int belowAvg(int[] sales) {
        int sumMonth = 0;
        for (int sale : sales) {
            // sales[sumMonth] - сумма продаж в месяцах ниже среднего
            // sale - продажи в рассматриваемом месяце
            if (sale < calcAvg(sales)) {
                sumMonth += 1;
            }
        }
        return sumMonth;
    }

    public int aboveAvg(int[] sales) {
        int sumMonth = 0;
        for (int sale : sales) {
            // sales[sumMonth] - сумма продаж в месяцах выше среднего
            // sale - продажи в рассматриваемом месяце
            if (sale > calcAvg(sales)) {
                sumMonth += 1;
            }
        }
        return sumMonth;
    }
}
