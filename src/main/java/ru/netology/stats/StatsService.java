package ru.netology.stats;

public class StatsService {

    public int sumSales(int[] sales) {

        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }

        return sum;
    }

    public int avgSales(int[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int maxSale(int[] sales) {

        int maxInd = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxInd]) {
                maxInd = i;
            }
        }
        return maxInd + 1;
    }

    public int minSale(int[] sales) {

        int minInd = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minInd]) {
                minInd = i;
            }
        }
        return minInd + 1;
    }

    public int counterMonthLessAvg(int[] sales) {

        int counter = 0;
        int avgSumSales = avgSales(sales);
        for (int sale : sales) {
            if (sale < avgSumSales) {
                counter += 1;
            }
        }
        return counter;
    }

    public int counterMonthMoreAvg(int[] sales) {

        int counter = 0;
        int avgSumSales = avgSales(sales);
        for (int sale : sales) {
            if (sale > avgSumSales) {
                counter += 1;
            }
        }
        return counter;
    }
}
