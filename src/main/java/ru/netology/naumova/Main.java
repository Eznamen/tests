package ru.netology.naumova;

public class Main {
    public static void main(String[] args) {

        long[] sales = new long[]{18941, 1587, 465, 5, 67, 219, 23, 444};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println("Макс: " + salesManager.max());
        System.out.println("Мин: " + salesManager.min());
        System.out.println("Обрезанное среднее = " + salesManager.stat());
        System.out.println("Какое число больше " + salesManager.newMax(1578));

    }
}