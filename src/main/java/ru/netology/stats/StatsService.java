package ru.netology.stats;

public class StatsService {
    public int sumMonth(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int minMonth(int[] sales) {
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

    public int maxMonth(int[] sales) {
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

    public int findAvg(int[] sales) {
        return sumMonth(sales) / sales.length;
    }

    public int underAvg(int[] sales) {
        int avg = findAvg(sales);
        int monthCount = 0;
        for (int sale : sales) {
            if (sale < avg) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public int overAvg(int[] sales) {
        int avg = findAvg(sales);
        int monthCount = 0;
        for (int sale : sales) {
            if (sale > avg) {
                monthCount++;
            }
        }
        return monthCount;
    }
}
